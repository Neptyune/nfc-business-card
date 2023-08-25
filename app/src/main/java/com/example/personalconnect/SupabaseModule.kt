package com.example.personalconnect

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.*
import io.github.jan.supabase.annotations.SupabaseExperimental
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.FlowType
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.gotrue.gotrue
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.postgrest
import io.github.jan.supabase.storage.Storage
import io.github.jan.supabase.storage.storage

import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
    @Module
    object SupabaseModule {//this is like a static class in java
        @OptIn(SupabaseExperimental::class)
        @Provides
        @Singleton
        fun provideSupabaseClient(): SupabaseClient {
            //supabase client is an interface for interacting with rest of the API
            return createSupabaseClient(
                supabaseUrl = BuildConfig.SUPABASE_URL,
                supabaseKey = BuildConfig.SUPABASE_ANON_KEY
            ) {
                install(Postgrest)//we are passing a companion object in postgrest class
                install(GoTrue) {
                    flowType = FlowType.PKCE
                    scheme = "app"
                    host = "supabase.com"
                }
                install(Storage)
            }
        }

        @Provides//annotation makes this method injectable as a dependency into other classes
        @Singleton
        fun provideSupabaseDatabase(client: SupabaseClient): Postgrest {
            return client.postgrest
        }

        @Provides
        @Singleton
        fun provideSupabaseGoTrue(client: SupabaseClient): GoTrue {
            return client.gotrue
        }


        @Provides
        @Singleton
        fun provideSupabaseStorage(client: SupabaseClient): Storage {
            return client.storage
        }

    }

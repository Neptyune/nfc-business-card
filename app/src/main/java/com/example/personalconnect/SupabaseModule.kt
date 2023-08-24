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
import io.github.jan.supabase.postgrest.Postgrest
import javax.inject.Singleton



@InstallIn(SingletonComponent::class)
    @Module
    object SupabaseModule {

        @OptIn(SupabaseExperimental::class)
        @Provides
        @Singleton
        fun provideSupabaseClient(): SupabaseClient {
            return createSupabaseClient(
                supabaseUrl = BuildConfig.SUPABASE_URL,
                supabaseKey = BuildConfig.SUPABASE_ANON_KEY
            ) {
                install(Postgrest)
                install(GoTrue) {
                    flowType = FlowType.PKCE
                    scheme = "app"
                    host = "supabase.com"
                }
                install(Storage)
            }
        }

        @Provides
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
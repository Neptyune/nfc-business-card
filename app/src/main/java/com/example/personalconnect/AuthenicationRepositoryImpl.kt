package com.example.personalconnect

import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.gotrue.providers.Google
import io.github.jan.supabase.gotrue.providers.builtin.Email
import javax.inject.Inject

class AuthenicationRepositoryImpl @Inject constructor(
    private val goTrue: GoTrue
) : AuthenticationRepository {
    override suspend fun signIn(email: String, password: String): Boolean {
        return try {
            goTrue.loginWith(Email) {
                this.email = email
                this.password = password
            }
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun logIn(email: String, password: String): Boolean {
        return try {
            goTrue.signUpWith(Email) {
                this.email = email
                this.password = password
            }
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun signInWithGoogle(): Boolean {
        return try {
            goTrue.loginWith(Google)
            true
        } catch (e: Exception) {
            false
        }
    }


}
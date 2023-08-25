package com.example.personalconnect

interface AuthenticationRepository {
    suspend fun signIn(email: String, password: String): Boolean
    suspend fun logIn(email: String, password: String): Boolean
    suspend fun signInWithGoogle(): Boolean
}
package com.example.personalconnect

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//DTO is short for data transfer object
@Serializable
data class SignUpDto(
    @SerialName("name")
    val name: String,

    @SerialName("surname")
    val surname: String,

    @SerialName("username")
    val username: String,

    @SerialName("password")
    val password: String,
)
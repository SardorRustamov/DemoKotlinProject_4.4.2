package com.example.demokotlinproject

import java.io.Serializable

class User(private val name: String, private val age: Int) : Serializable {
        override fun toString(): String {
            return "Name: $name  Age: $age"
        }
}

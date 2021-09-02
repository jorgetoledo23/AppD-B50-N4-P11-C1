package com.example.firstApp.Model

class User {
    public lateinit var Username:String
    public lateinit var Password:String

    override fun toString(): String {
        return Username
    }
}
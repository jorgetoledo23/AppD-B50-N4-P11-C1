package com.example.firstApp.Model

class User2 (Username:String, Password:String){
    val nombreUsuario = Username.uppercase()
    val contrasena = Password

    override fun toString(): String {
        return nombreUsuario
    }
}
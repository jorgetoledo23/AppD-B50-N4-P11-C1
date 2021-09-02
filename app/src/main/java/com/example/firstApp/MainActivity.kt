package com.example.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firstApp.Model.User
import com.example.firstApp.Model.User2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables
        var Username:String
        // Inferir el Tipo
        var Username2 = "nombreUsuario" //Reconoce que Username2 es de tipo String
        var Edad = 10
        var Edad2:Int = 10
        var resultado:Boolean = true
        //Lenguaje FUERTEMENTE TIPADO
        //Username = 10
        var Direccion = "Curico, Merced 300"
        var Direccion2:String

        //Constante
        val PI = 3.1416



        //Funciones
        fun Sumar(x: Int, y: Int): Int {
            return x + y
        }
        // public String Saludar(String nombre){}
        fun Saludar(nombre:String){
            Log.i("INFO CLASE", "Hola $nombre ")
        }

        fun Saludar():String{
            return "Hola Mundo"
        }

        fun Saludar2(){
            Log.i("INFO CLASE", "Hola")
        }

        Saludar("Jorge")
        Log.i("INFO CLASE", Sumar(10,20).toString()) // I/INFO CLASE: 30

        //Instancia de la Clase Usuario
        // User miUsuario = new User();
        var miUsuario = User()
        miUsuario.Password = "123456"
        miUsuario.Username = "jorge.toledo11@inacapmail.cl"

        var miUsuario2 = User2("jorge.toledo11@inacapmail.cl", "123456")
        Log.i("INFO CLASE", miUsuario2.toString()) //I/INFOCLASE: JORGE.TOLEDO11@INACAPMAIL.CL


    }
}
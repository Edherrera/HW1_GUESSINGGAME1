package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    var randomNumber : Int = Random.nextInt(1,1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun myFunction(p: View){
        val editNumber : EditText = findViewById(R.id.editNumber)
        val myTextView : TextView = findViewById(R.id.myText)

        if (editNumber.text.toString().length == 0) {
                myTextView.text = "Error... ingrese un numero"
            } else {

            val num = editNumber.text.toString().toInt()

            println(randomNumber)


            Toast.makeText(this, "Hello ${randomNumber}!!", Toast.LENGTH_LONG).show()
            //myTextView.text = "Ingresaste el: ${num}"

            if (num == randomNumber) {
                myTextView.text = "ganaste adivinaste si es el numero ${num}"
            } else {
                myTextView.text = "perdiste no era el numero ${num}"
            }

        }
    }


}
package com.omercankoc.abacus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class AbacusActivity : AppCompatActivity() {

    private var input : Double = 0.0
    private var output : Double = 0.0

    private lateinit var editTextAbacus : EditText
    private lateinit var buttonAddition : Button
    private lateinit var buttonSubtraction : Button
    private lateinit var buttonDivision : Button
    private lateinit var buttonMultiplication : Button
    private lateinit var buttonEqual : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abacus)
        initialize()
    }

    private fun initialize(){
        editTextAbacus = findViewById(R.id.editTextAbacus)
        buttonAddition = findViewById(R.id.buttonAddition)
        buttonSubtraction = findViewById(R.id.buttonSubtraction)
        buttonDivision = findViewById(R.id.buttonDivision)
        buttonMultiplication = findViewById(R.id.buttonMultiplication)
        buttonEqual = findViewById(R.id.buttonEqual)
    }

    fun addition(view : View){
        input = editTextAbacus.text.toString().toDouble()
        if(input == null){
            input = 0.0
        }
        output += input
        println(output)
    }

    fun subtraction(view : View){
        input = editTextAbacus.text.toString().toDouble()
        if(input == null){
            input = 0.0
        }
        output -= input
        println(output)
    }

    fun division(view : View){
        input = editTextAbacus.text.toString().toDouble()
        if(input == null){
            input = 0.0
        }
        output /= input
        println(output)
    }

    fun multiplication(view : View){
        input = editTextAbacus.text.toString().toDouble()
        if(input == null){
            input = 0.0
        }
        output *= input
        println(output)
    }

    fun equal(view : View){
        print(output)
    }
}
package com.fliaPerez.clase1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val inputText : EditText = findViewById<EditText>(R.id.inputText)
        val textTitulo = findViewById<TextView>(R.id.tituloApp)
        val textError: TextView = findViewById <TextView> (R.id.errortextView)
        val boton1 : Button = findViewById<Button> (R.id.btn1)
        val boton2 : Button = findViewById<Button> (R.id.btn2)
        val boton3 : Button = findViewById<Button> (R.id.btn3)
        val boton4 : Button = findViewById<Button> (R.id.btn4)
        val boton5 : Button = findViewById<Button> (R.id.btn5)

        fun validarInput(){
            val valorInput :String = inputText.text.toString()
            if(valorInput == ""){
                textError.text = "Debe llenar el campo"
            }else{
                textError.text = ""
            }
        }

        boton1.setOnClickListener(){
            validarInput()
            if(textError.text.toString() == ""){
                textTitulo.text = inputText.text.toString()
                textTitulo.setTextColor(Color.parseColor("#FFFFFF"))
                textTitulo.setBackgroundColor(Color.parseColor("#34495E"))
            }
        }

        boton2.setOnClickListener(){
            validarInput()
            if(textError.text.toString() == ""){
                textTitulo.text = inputText.text.toString()
                textTitulo.setTextColor(Color.parseColor("#FFFFFF"))
                textTitulo.setBackgroundColor(Color.parseColor("#D35400"))
            }
        }

        boton3.setOnClickListener(){
            validarInput()
            if(textError.text.toString() == ""){
                textTitulo.text = inputText.text.toString()
                textTitulo.setTextColor(Color.parseColor("#FFFFFF"))
                textTitulo.setBackgroundColor(Color.parseColor("#2ECC71"))
            }
        }

        boton4.setOnClickListener(){
            validarInput()
            if(textError.text.toString() == ""){
                textTitulo.text = inputText.text.toString()
                textTitulo.setTextColor(Color.parseColor("#FFFFFF"))
                textTitulo.setBackgroundColor(Color.parseColor("#3498DB"))
            }
        }

        boton5.setOnClickListener(){
            validarInput()
            if(textError.text.toString() == ""){
                textTitulo.text = inputText.text.toString()
                textTitulo.setTextColor((Color.parseColor("#FFFFFF")))
                textTitulo.setBackgroundColor(Color.parseColor("#E74C3C"))
            }
        }


     }
}
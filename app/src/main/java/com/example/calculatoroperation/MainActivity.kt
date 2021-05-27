package com.example.calculatoroperation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etnumber1 = findViewById<EditText>(R.id.etnumber1)
        val etnumber2 = findViewById<EditText>(R.id.etnumber2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubstract = findViewById<Button>(R.id.btnSubstract)
        val btnModulus = findViewById<Button>(R.id.btnModulus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)


        btnAdd.setOnClickListener {
            if (etnumber1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()

            } else if (etnumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                val number1 = etnumber1.text.toString().toInt()
                val number2 = etnumber2.text.toString().toInt()
                val addTotal = number1 + number2
                tvTotal.text = "Answer ${addTotal}"

            }
        }
        btnSubstract.setOnClickListener {
            if (etnumber1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                val number1 = etnumber1.text.toString().toInt()
                val number2 = etnumber2.text.toString().toInt()
                val substractTotal = number1 - number2
                tvTotal.text = "Answer ${substractTotal}"


            }

        }
        btnModulus.setOnClickListener {
            if (etnumber1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                val number1 = etnumber1.text.toString().toInt()
                val number2 = etnumber2.text.toString().toInt()
                val modulusTotal = number1 - number2
                tvTotal.text = "Answer ${modulusTotal}"


            }
        }
        btnMultiply.setOnClickListener {
            if (etnumber1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                val number1 = etnumber1.text.toString().toInt()
                val number2 = etnumber2.text.toString().toInt()
                val multiplyTotal = number1 - number2
                tvTotal.text = "Answer ${multiplyTotal}"
            }
        }
    }
}
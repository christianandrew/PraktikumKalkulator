package com.example.praktikumkalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textNumber1 = findViewById<EditText>(R.id.num1)
        val textNumber2 = findViewById<EditText>(R.id.num2)
        val textHasil = findViewById<TextView>(R.id.sum)
        val buttonTambah = findViewById<Button>(R.id.buttonPlus)
        val buttonMinus = findViewById<Button>(R.id.buttonMin)

        buttonTambah.setOnClickListener {
            if (textNumber1.text.toString().isEmpty() || textNumber2.text.toString().isEmpty()) {
                textNumber1.setError("Semua input harus diisi!")
            } else {
                val num1 = textNumber1.text.toString().toInt()
                val num2 = textNumber2.text.toString().toInt()
                val sumFinal = this.tambah(num1,num2)
                textHasil.setText(sumFinal.toString())
            }
        }

        buttonMinus.setOnClickListener {
            if (textNumber1.text.toString().isEmpty() || textNumber2.text.toString().isEmpty()) {
                textNumber1.setError("Semua input harus diisi!")
            } else {
                val num1 = textNumber1.text.toString().toInt()
                val num2 = textNumber2.text.toString().toInt()
                val sumFinal = this.kurang(num1,num2)
                textHasil.setText(sumFinal.toString())
            }
        }
    }

    fun kurang(a: Int, b: Int): Int {
        return b - a
    }

    fun tambah(a: Int, b: Int): Int {
        return a + b
    }

}
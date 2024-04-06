package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() { //сделали главным Activity в manifests
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun onClickGoActivity1(view:View){
        val intent = Intent(this,MainActivity::class.java)//this здесь т.е это активити поменять на указанное после запятой активити
        startActivity(intent) //старт указанной в скобках переменной
    }
    fun onClickGoActivity2(view:View){
        val intent=Intent(this,MainActivity2::class.java)
      startActivity(intent)
    }
}
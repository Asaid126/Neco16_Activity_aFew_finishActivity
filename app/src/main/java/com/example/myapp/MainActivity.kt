package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { //в manifests сделали не главным Activity
lateinit var bindingClass: ActivityMainBinding //сделали через viewBinding(который активировали в gradle)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun onClickGoActivity2(view: View){
        var intent2=Intent(this,MainActivity2::class.java)//this здесь т.е это активити поменять на указанное после запятой активити
        startActivity(intent2)//старт указанной в скобках переменной
    }
    fun close(view: View){
       finish()
    }

}
package com.example.loginpageui

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singUp = findViewById<TextView>(R.id.singUp)
        val logIn = findViewById<TextView>(R.id.logIn)
        val singUpLayout = findViewById<LinearLayout>(R.id.singUpLayout)
        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        val singIn = findViewById<TextView>(R.id.singIn)

        singUp.setOnClickListener{
            singUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            singUp.setTextColor(resources.getColor(R.color.textColor,null))
            logIn.background = null
            singUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.blueColor,null))
        }
        logIn.setOnClickListener{
            singUp.background = null
            singUp.setTextColor(resources.getColor(R.color.black,null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            singUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.black,null))
        }
        singIn.setOnClickListener{
            startActivity(Intent(this@MainActivity,Welcome::class.java))
        }
    }
}
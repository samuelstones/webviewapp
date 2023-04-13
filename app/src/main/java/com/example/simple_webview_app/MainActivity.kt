package com.example.simple_webview_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnkcbWebsite: Button
    lateinit var btnboawebsite: Button
    lateinit var btnEquitywebsite: Button
    lateinit var btncooperativewebsite: Button
    lateinit var btnncbawebsite: Button
    lateinit var btnfamilybankwebsite: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnkcbWebsite = findViewById(R.id.webkcbbtn1)
        btnboawebsite = findViewById(R.id.webbtn2)
        btnEquitywebsite = findViewById(R.id.webbtn3)
        btncooperativewebsite = findViewById(R.id.webbtn4)
        btnncbawebsite = findViewById(R.id.webbtn5)
        btnfamilybankwebsite = findViewById(R.id.webbtn6)


        btnkcbWebsite.setOnClickListener {
            //code to navigate from one activity to another
            val gotoanotheractivity = Intent(this, kcb_activity::class.java)
            startActivity(gotoanotheractivity)
        }

        btnboawebsite.setOnClickListener {
            //code to navigate from one activity to another
            val gotoanotheractivity = Intent(this, Boa_activity::class.java)
            startActivity(gotoanotheractivity)
        }


        btnEquitywebsite.setOnClickListener {
            //code to navigate from one activity to another
            val gotoanotheractivity = Intent(this, Equity_activity::class.java)
            startActivity(gotoanotheractivity)
        }

        btncooperativewebsite.setOnClickListener {
            //code to navigate from one activity to another
            val gotoanotheractivity = Intent(this, cooperative_activity::class.java)
            startActivity(gotoanotheractivity)
        }

        btnncbawebsite.setOnClickListener {
            //code to navigate from one activity to another
            val gotoanotheractivity = Intent(this, Ncba_activity::class.java)
            startActivity(gotoanotheractivity)
        }

        btnfamilybankwebsite.setOnClickListener {
            //code to navigate from one activity to another
            val gotoanotheractivity = Intent(this, FamilyBank_activity::class.java)
            startActivity(gotoanotheractivity)
        }














    }
}
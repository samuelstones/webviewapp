package com.example.simple_webview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class cooperative_activity : AppCompatActivity() {
    lateinit var myWeb: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooperative)
        myWeb = findViewById(R.id.web_cooperative)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.co-opbank.co.ke/")


    }
}
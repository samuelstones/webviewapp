package com.example.simple_webview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Ncba_activity : AppCompatActivity() {
    lateinit var myWeb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncba)
        myWeb = findViewById(R.id.web_Ncba)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://ke.ncbagroup.com/")





    }
}
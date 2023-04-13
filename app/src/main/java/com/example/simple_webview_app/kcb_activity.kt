package com.example.simple_webview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class kcb_activity : AppCompatActivity() {
    lateinit var myWeb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)
        myWeb = findViewById(R.id.web_kcb)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://ke.kcbgroup.com/for-you?utm_source=search&utm_medium=cpc&utm_campaign=2023+KCB+KE+Always+On&utm_content=text_ads&gclid=EAIaIQobChMIltnu54-k_gIVDPt3Ch3kyAQKEAAYASAAEgJ-s_D_BwE")
    }
}

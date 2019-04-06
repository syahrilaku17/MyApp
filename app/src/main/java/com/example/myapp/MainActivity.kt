package com.example.myapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn_twitter.setOnClickListener {
            val  dialIntent = Intent(android.content.Intent.ACTION_VIEW)
            dialIntent.data = Uri.parse("https://twitter.com/FattahIrfani")
            startActivity(dialIntent)
        }
        btn_facebook.setOnClickListener {
            val  dialIntent = Intent(android.content.Intent.ACTION_VIEW)
            dialIntent.data = Uri.parse("https://www.facebook.com/syahrilirfanilfattah")
            startActivity(dialIntent)
        }
        btn_instagram.setOnClickListener {
            val  dialIntent = Intent(android.content.Intent.ACTION_VIEW)
            dialIntent.data = Uri.parse("https://instagram.com/syahril_irfani")
            startActivity(dialIntent)
        }
        btn_github.setOnClickListener {
            val  dialIntent = Intent(android.content.Intent.ACTION_VIEW)
            dialIntent.data = Uri.parse("https://github.com/syahrilaku17")
            startActivity(dialIntent)
        }
    }
}

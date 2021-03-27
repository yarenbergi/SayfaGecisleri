package com.yarenbergi.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA.setOnClickListener {
            val intent = Intent(this@MainActivity, SayfaA::class.java)
            startActivity(intent)
        }

        buttonX.setOnClickListener {
            val intent = Intent(this@MainActivity, SayfaX::class.java)
            startActivity(intent)
        }
    }
}
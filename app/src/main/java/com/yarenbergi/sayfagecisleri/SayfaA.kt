package com.yarenbergi.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa.*

class SayfaA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa)

        buttonB.setOnClickListener {
            val intent = Intent(this@SayfaA, SayfaB::class.java)
            startActivity(intent)
        }
    }
}
package com.yarenbergi.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_x.*

class SayfaX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_x)

        buttonXtoY.setOnClickListener {
            val intent = Intent(this@SayfaX, SayfaY::class.java )
            startActivity(intent)
        }
    }
}
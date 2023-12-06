package com.github.maazapan.scrumtable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logo = findViewById<ImageView>(R.id.imageView)

        logo.setOnClickListener() {
            val i = Intent(this, AuthActivity::class.java);
            startActivity(i)
            finish()
        }
    }
}
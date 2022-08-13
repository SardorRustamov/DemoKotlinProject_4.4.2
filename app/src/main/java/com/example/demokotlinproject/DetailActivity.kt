package com.example.demokotlinproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        intiViews()
    }
    fun intiViews() {
        val tv_detail = findViewById<TextView>(R.id.tv_detail)
        val user = intent.getSerializableExtra("user")
        tv_detail.text = user.toString()
    }
}
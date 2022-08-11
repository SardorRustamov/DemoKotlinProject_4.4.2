package com.example.demokotlinproject

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
        val tv_detail2 = findViewById<TextView>(R.id.tv_detail2)
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        tv_detail.text = name
        tv_detail2.text = age
    }
}
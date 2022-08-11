
package com.example.demokotlinproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();
    }
    fun initViews(){
        val b_open_details = findViewById<Button>(R.id.b_detail)
        b_open_details.setOnClickListener { openDetailActivity() }

    }

    private fun openDetailActivity() {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name", "Sardor")
        intent.putExtra("age", "22")
        startActivity(intent)
    }
}
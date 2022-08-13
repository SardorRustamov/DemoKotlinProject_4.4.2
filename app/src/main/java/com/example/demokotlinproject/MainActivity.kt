
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
        var b_open_details = findViewById<Button>(R.id.b_detail)
        b_open_details.setOnClickListener {
            var user = User("Anvar", 15)
            openDetailActivity(user)
        }
    }
    private fun openDetailActivity(user: User) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}
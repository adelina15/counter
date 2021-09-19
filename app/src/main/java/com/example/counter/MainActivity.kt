package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            count++
            displayCount(count)
        }
    }



    private fun displayCount(count: Int) {
        val countTextView = findViewById<TextView>(R.id.count_text)
        countTextView.text = count.toString().padStart(4, '0')
    }


}


package com.example.a20012011102_pract3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
lateinit var textView2: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2 = findViewById(R.id.textView2)
        textView2.setOnClickListener {
            intent = Intent(this, secondactivity::class.java)
            startActivity(intent)
        }
    }
}
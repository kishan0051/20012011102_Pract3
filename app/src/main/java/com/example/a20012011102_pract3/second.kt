package com.example.a20012011102_pract3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.content.Intent

class second : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        editText = findViewById(R.id.editTextTextPersonName)
    }
    fun GoToNext(view: View) {
        Log.d("secondactivity", "Clicked.")
        val message = editText.text.toString()
        intent = Intent(this, thirdactivity::class.java)
        intent.putExtra("secondactivity", message)
        startActivity(intent)
    }
}
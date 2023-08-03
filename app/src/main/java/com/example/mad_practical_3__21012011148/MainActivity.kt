package com.example.mad_practical_3__21012011148

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonclick=findViewById<Button>(R.id.btnclick)

        buttonclick.setOnClickListener {
            Toast.makeText(this,"Thanks for the Response",Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.nestonespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<AppCompatEditText>(R.id.edit_name)
        val button = findViewById<AppCompatButton>(R.id.button_click_me)

        edit.doAfterTextChanged { text ->
            text?.let {
                button.isEnabled = it.length > 3
            }
        }
    }
}

package com.example.slawomirpotoczekhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_how_many_fingers.*

class HowManyFingersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_many_fingers)
    }

    fun playTheGame(view: View) {
        val number = type_the_number.text.toString()
        if (number.any() && number.toIntOrNull() != null) {
            val generateNumber = (1..10).random()
            if (generateNumber == number.toIntOrNull()) {
                result.text = "You WON!"
            } else {
                result.text = "You LOST! Drawn number: $generateNumber"
            }
        }
    }
}
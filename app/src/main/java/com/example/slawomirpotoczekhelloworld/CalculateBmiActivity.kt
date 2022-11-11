package com.example.slawomirpotoczekhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.bmi_layout.*

class CalculateBmiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi_layout)
    }

    fun calculateBmi(view: View) {
        val weight = given_weight.text.toString().toFloat()
        val height = given_height.text.toString().toFloat()
        val bmi = weight / (height * height)

        if (bmi < 18.5) healthIndicator.setImageResource(R.drawable.underweight)
        else if (bmi in 18.5..24.9) healthIndicator.setImageResource(R.drawable.healthy)
        else if (bmi in 25.0..29.9) healthIndicator.setImageResource(R.drawable.overweight)
        else if (bmi in 30.0..34.9) healthIndicator.setImageResource(R.drawable.obesity)
    }
}
package com.example.slawomirpotoczekhelloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun runTestActionsActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun runHowManyFingersActivity(view: View) {
        val intent = Intent(this, HowManyFingersActivity::class.java)
        startActivity(intent)
    }

    fun runCalculateBmiActivity(view: View) {
        val intent = Intent(this, CalculateBmiActivity::class.java)
        startActivity(intent)
    }

    fun runRollDicesActivity(view: View) {
        val intent = Intent(this, RollDicesActivity::class.java)
        startActivity(intent)
    }
}
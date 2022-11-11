package com.example.slawomirpotoczekhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.dice_layout.*

class RollDicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_layout)
    }

    private val dices = intArrayOf(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
    )

    fun rollDices(view: View) {
        val leftDiceNum = (0..5).random()
        val rightDiceNum = (0..5).random()

        leftDice.setImageResource(dices[leftDiceNum])
        rightDice.setImageResource(dices[rightDiceNum])
    }
}

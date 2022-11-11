package com.example.slawomirpotoczekhelloworld

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actions_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actions_layout)
    }

    fun writeToLogCat(view: View) {
        Log.i("MyApp", "Message from my app")
    }

    fun showToastMessage(view: View) {
        val toast = Toast.makeText(
            this,
            "The message from the second button",
            Toast.LENGTH_LONG
        )
        toast.setGravity(Gravity.TOP, 0, 200)
        toast.show()
    }

    fun showXMLToast(view: View) {
//        var toastView = layoutInflater.inflate(R.layout.custom_toast_layout, null)
        val toast = Toast.makeText(this, "", Toast.LENGTH_LONG)
        toast.show()
    }

    fun writeToEditText(view: View) {
        write_to_edit_text.setText(write_sth_to_edittext_button.text)
    }

    fun copyUserValueToEditText(view: View) {
        user_value_write_to_edit_text.text = user_value_edit_text.text
    }
}

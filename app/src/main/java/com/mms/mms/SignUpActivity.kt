package com.mms.mms

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        findViewById<CheckBox>(R.id.check_box).setOnClickListener {
//            Log.d("test", "test")
//        Toast.makeText(this, "Ehh", Toast.LENGTH_SHORT).show()
//        finish()
//        }
    }

    fun toastPopUp(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            if (checked) {
                Toast.makeText(this, "Ehh", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun finishActivity(view: View) {
        finish()
        setContentView(R.layout.fragment_sign_up)
    }
}
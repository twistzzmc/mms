package com.mms.mms

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
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
    }

    fun submit(view: View) {
        val login: TextView = findViewById(R.id.et_user_name)
        val login_text = login.text
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Androidly Alert")
        builder.setMessage("Login gut: $login_text")
        //builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton(android.R.string.no) { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.no, Toast.LENGTH_SHORT).show()
        }

        builder.setNeutralButton("Maybe") { dialog, which ->
            Toast.makeText(applicationContext,
                "Maybe", Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }
}
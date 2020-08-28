package com.mms.mms

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_login).setOnClickListener {
            val userName = view.findViewById<EditText>(R.id.et_user_name).text.toString()
            val password = view.findViewById<EditText>(R.id.et_password).text.toString()

            var validInput = true
            //TODO check if input is valid and present in database

            if (validInput) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
            else {
                Toast.makeText(this@FirstFragment.context, "Incorrect user name or password!", Toast.LENGTH_SHORT).show()
            }
        }

        view.findViewById<Button>(R.id.button_sign_up).setOnClickListener {
            val intent = Intent(this@FirstFragment.context, SignUpActivity::class.java)
            startActivity(intent)
//            findNavController().navigate(R.id.action_FirstFragment_to_SignUpFragment)
        }

        view.findViewById<TextView>(R.id.reset_password).setOnClickListener {
            Toast.makeText(this@FirstFragment.context, "Reset password TODO", Toast.LENGTH_SHORT).show()
        }
    }
}
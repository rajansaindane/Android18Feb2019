package com.melayer.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.setOnClickListener {
            checkValidation()
        }

    }

    private fun checkValidation() {

        if (edtName.text.toString().isEmpty())
        {
            Toast.makeText(this@RegistrationActivity,"Enter Name",Toast.LENGTH_SHORT)
                    .show()
        }
        else if (edtUserName.text.toString().isEmpty())
        {
            Toast.makeText(this@RegistrationActivity,"Enter userName",Toast.LENGTH_SHORT)
                    .show()
        }
        else if (edtPassword.text.toString().isEmpty())
        {
            Toast.makeText(this@RegistrationActivity,"Enter Password",Toast.LENGTH_SHORT)
                    .show()
        }
        else if (edtMobileNumber.text.toString().isEmpty() || edtMobileNumber.text.toString().length<10)
        {
            Toast.makeText(this@RegistrationActivity,"Enter mobile number",Toast.LENGTH_SHORT)
                    .show()
        }
        else
        {

            val intent=Intent(this@RegistrationActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

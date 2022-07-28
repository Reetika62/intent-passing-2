package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
     lateinit var etUsername : EditText
     lateinit var etAGE : EditText
     lateinit var etEmail: EditText
    lateinit var etPhoneNumber : EditText
    lateinit var etAddress: EditText
    lateinit var etInformation: EditText
    lateinit var btnREGISTER: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         etUsername = findViewBy(R.id.etUsername)
         etAGE  = findViewBy(R.id.etAGE)
         etEmail  = findViewBy(R.id.etEmail)
         etPhoneNumber  = findViewBy(R.id.etPhoneNumber)
         etAddress  = findViewBy(R.id.etAddress)
         etInformation  = findViewBy(R.id.etInformation)
         btnREGISTER  = findViewBy(R.id.btnRegister)

        btnRegister.setOnclickListner {
        System.Out.println("REGISTER clicked")
                var Username = etUsername.text.toString().toDouble()
                var etAGE = etAGE.text.toString().toInt()
             var etEmail = etEmail.text.toString().tolong()
             var etPhoneNumber = etPhone_NumBer.text.toString()
             var etAddress = etAddress.text.tostring()
             var etInformation = etInformation.text.toString().toFloat()

            var intent =Intent(packageContent:this,SecondActivity::class.java)
            intent.putExtra(name "Username", Username)
            intent.putExtra(name "AGE", AGE)
            intent.putExtra(name "Email", Email)
            intent.putExtra(name "Address", Address)
            intent.putExtra(name Information", Information)
            startActivity(intent)/>

    }
}}
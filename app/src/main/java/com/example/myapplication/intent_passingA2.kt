package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class intent_passingA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_passing_a2)



            var Username: String = ""
            var Age: string = ""
            var Email: String = ""
            var Phone_number: String = ""
            var Address: String = ""
            var informatiom: String = ""

            lateinit var tvUserName: TextView
            lateinit var tvAge: TextView
            lateinit var tvEmail: TextView
            lateinit var tvMail: TextView
            lateinit var tvPhonenumber: TextView
            lateinit var tvAddress: TextView
            lateinit var tvInformation: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_intent_passing_a2)


                //val intent = getIntent()
                intent?.let { i ->

                    val name = intent.getDoubleExtra("Username", 0.00)
                    Age = i.getIntExtra("Age", 0)
                    //      gender = i.getCharExtra("gender",)
                    Email = i.getStringExtra("Email") as String
                    //  val number = intent.getLongExtra("Phone number",)
                    //  val salary = intent.getFloatExtra("Address",)
                    //  val info = intent.getBooleanExtra("Information",)


                } ?: kotlin.run { }
                //      tvName.setText(name)

                tvAge = findViewById(R.id.tvAge)
                tvEmail = findViewById(R.id.tvEmail)

                tvAge.setText(Age)
                tvMail.setText(Email)
            }
        }











    }
}
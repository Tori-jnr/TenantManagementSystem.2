package com.example.tenantmanagementsystem

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var tenantName = findViewById<EditText>(R.id.editTenant)
        var tenantPhoneNumber = findViewById<EditText>(R.id.editPhone)
        var rentPaid = findViewById<EditText>(R.id.editRent)
        var buttonDisplay = findViewById<Button>(R.id.saveDetails)
        var displayTextView = findViewById<TextView>(R.id.textViewDisplay)

   buttonDisplay.setOnClickListener {

       var name = tenantName.text.toString()
       var phone = tenantPhoneNumber.text.toString()
       var rent = rentPaid.text.toString()


       displayTextView.text = "The tenant added is: \nTenant Name:$name \nTenant Phone: $phone \nRent Paid: $rent"

   }








    }
}
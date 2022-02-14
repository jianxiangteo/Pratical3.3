package com.example.pratical3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA:Button = findViewById(R.id.btnA)
        btnA.setOnClickListener(){
            val intentA:Intent = Intent(this, AboutActivity::class.java)

            intentA.putExtra("StudentName","John")

            startActivity(intentA)
        }

        val btnB:Button = findViewById(R.id.btnB)
          btnB.setOnClickListener(){

              //val telNo = Uri.parse("tel:101")
              //val intentB:Intent = Intent(Intent.ACTION_DIAL, telNo)
              val geo = Uri.parse("geo:3.140853, 101.693207")
              val intentB:Intent = Intent(Intent.ACTION_VIEW, geo)
              startActivity(intentB)
          }
    }

}
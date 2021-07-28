package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener()
        {
//            val aboutIntent = Intent(this, AboutActivity::class.java)
//            startActivity(aboutIntent)

//            val value = Uri.parse("tel:0123456789")
//            val intent = Intent(Intent.ACTION_DIAL, value)

//            val geo = Uri.parse("geo:lat,lon")
//            val intent = Intent(Intent.ACTION_VIEW, geo)

            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT,"Hello")

            try{
                startActivity(intent)
            }catch (e:ActivityNotFoundException){
                Toast.makeText(this,"App not found",Toast.LENGTH_LONG).show()
            }



        }
    }
}
package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import kotlin.system.exitProcess

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<ImageView>(R.id.imageView3).apply {
            setBackgroundResource(R.drawable.animation)
            val download = background as AnimationDrawable
            download.start()
        }
        }

    fun g2(view: View){
        val intent = Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(intent)
    }
    fun OnClick(view: View){
        val intent = Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(intent)
    }
    fun a1(view: View){
        val intent = Intent(this@MainActivity2, MainActivity5::class.java)
        startActivity(intent)
    }
    fun Theme(view: View) {
        val sw: Switch = findViewById(R.id.switch1)
        if (sw.isChecked) AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

}
package com.example.koalaap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        verBienvenida()
    }
    fun verBienvenida(){
        object : CountDownTimer(2000, 1000){
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                //Dirigirnos a la actividad MainActivity
                val intent = Intent(this@Bienvenida,MainActivity::class.java)
                startActivity(intent)
                finishAffinity()
            }

        }.start()
    }
}
package com.submissionidcamp.carrental

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class SplashAct : AppCompatActivity() {
    var mProgress: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Inisialisasi
        mProgress   = findViewById<View>(R.id.pb_splashscreen) as ProgressBar
        Thread(Runnable {
            doWork() //Memanggil Function doWork()
            startApp() //Memanggil Functuon startApp()
        }).start()
    }

    private fun doWork() {
        var progress = 0
        while (progress < 100) {
            try {
                Thread.sleep(500)
                mProgress!!.progress = progress
            }catch (e: Exception) {
                e.printStackTrace()
            }
            progress += 10
        }
    }

    //Function startApp()
    private fun startApp() {
       startActivity(Intent(this@SplashAct, MainActivity::class.java))
    }
}
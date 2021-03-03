package com.path_studio.bstore.Activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.path_studio.bstore.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({
            // If first time open apps

            //If already open this app before
            val intent = Intent(this@SplashActivity, IntoActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}
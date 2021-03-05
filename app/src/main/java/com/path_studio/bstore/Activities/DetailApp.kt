package com.path_studio.bstore.Activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.DoubleConverter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.R
import java.util.*
import kotlin.collections.ArrayList

class DetailApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_app)

        //show all data into UI
        showData(intent.getSerializableExtra("appData") as ArrayList<App>)
    }

    private fun showData(list:ArrayList<App>){
        val appLogo: ImageView = findViewById(R.id.detail_appLogo)
        val appName: TextView = findViewById(R.id.detail_appName)
        val devName: TextView = findViewById(R.id.detail_devName)
        val appCategory: TextView = findViewById(R.id.detail_appCategory)
        val appRating: TextView = findViewById(R.id.detail_appRating)
        val appSize: TextView = findViewById(R.id.detail_appSize)

        Glide.with(this)
                .load(list[0].appLogo)
                .apply(RequestOptions().override(150, 150))
                .into(appLogo)

        appName.text = list[0].appName
        devName.text = list[0].devName
        appCategory.text = list[0].appCategory
        appRating.text = list[4].ratting.toString()
        appSize.text = DoubleConverter.convertSizeToText(list[0].appSize)
    }

}
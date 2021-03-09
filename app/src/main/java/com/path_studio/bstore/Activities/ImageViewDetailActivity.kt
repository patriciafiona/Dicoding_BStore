package com.path_studio.bstore.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.R

class ImageViewDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view_detail)

        //Show Image
        val imgURL: String? = intent.getStringExtra("imageURL")
        imgURL?.let { showImage(it) }

        //set back button listener
        setBackBtnListener()
    }

    private fun setBackBtnListener(){
        val backBtn: ImageButton = findViewById(R.id.imageViewBackBtn)
        backBtn.setOnClickListener {
            super.onBackPressed(); // or super.finish();
        }
    }

    private fun showImage(imgURL: String){
        val imageViewer: ImageView = findViewById(R.id.imageViewer_img)
        Glide.with(this)
            .load(imgURL)
            .into(imageViewer)
    }
}
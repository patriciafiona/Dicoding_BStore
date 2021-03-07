package com.path_studio.bstore.Activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.Adapters.DetailBannerSliderAdapter
import com.path_studio.bstore.HorizontalMarginItemDecoration
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R
import java.lang.Math.abs
import java.util.*


class DetailApp : AppCompatActivity() {
    private lateinit var listData:ArrayList<App>
    private lateinit var appBgImage: ImageView

    private var sliderAdapter: DetailBannerSliderAdapter? = null
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_app)

        //show all data into UI
        val appID:Int = intent.getIntExtra("appID", 0)
        listData = AppsData.listDataFromID(appID)
        showData(listData)

        //Change App background Color
        settingAnimatedBackground()

        //Show Detail Banner
        showDetailBanner(listData[0].arrayDetailBanner, listData[0].detailBannerType)
        Log.e("Hasil dari list img banner: ", listData[0].arrayDetailBanner[0].toString())
    }

    private fun settingAnimatedBackground(){
        val zoomInAnim: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in)

        val animation = AnimationSet(false) //change to false
        animation.addAnimation(zoomInAnim)
        appBgImage.setAnimation(animation)
    }

    private fun showData(list: ArrayList<App>){
        val appLogo: ImageView = findViewById(R.id.detail_appLogo)
        val appName: TextView = findViewById(R.id.detail_appName)
        val devName: TextView = findViewById(R.id.detail_devName)
        val appCategory: TextView = findViewById(R.id.detail_appCategory)
        appBgImage = findViewById(R.id.detail_backgroundGradient)

        Glide.with(this)
                .load(list[0].appLogo)
                .apply(RequestOptions().override(150, 150))
                .into(appLogo)

        Glide.with(this)
            .load(list[0].appBgDetail)
            .apply(RequestOptions().override(500, 500))
            .into(appBgImage)

        appName.text = list[0].appName
        devName.text = list[0].devName
        appCategory.text = list[0].appCategory
    }

    private fun showDetailBanner(listData:Array<String>, imgType:String){
        viewPager2 = findViewById<View>(R.id.detail_appImgSlider) as ViewPager2
        sliderAdapter = DetailBannerSliderAdapter(listData, imgType)

        viewPager2.adapter = sliderAdapter

        // You need to retain one page on each side so that the next and previous items are visible
        viewPager2.offscreenPageLimit = 1

        // Add a PageTransformer that translates the next and previous items horizontally
        // towards the center of the screen, which makes them visible
        val nextItemVisiblePx = resources.getDimension(R.dimen.viewpager_next_item_visible)
        val currentItemHorizontalMarginPx = resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin)
        val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslationX * position
            // Next line scales the item's height. You can remove it if you don't want this effect
            page.scaleY = 1 - (0.25f * abs(position))
            // If you want a fading effect uncomment the next line:
            // page.alpha = 0.25f + (1 - abs(position))
        }
        viewPager2.setPageTransformer(pageTransformer)

        // The ItemDecoration gives the current (centered) item horizontal margin so that
        // it doesn't occupy the whole screen width. Without it the items overlap
        val itemDecoration = HorizontalMarginItemDecoration(
            this,
            R.dimen.viewpager_current_item_horizontal_margin
        )
        viewPager2.addItemDecoration(itemDecoration)

    }

}
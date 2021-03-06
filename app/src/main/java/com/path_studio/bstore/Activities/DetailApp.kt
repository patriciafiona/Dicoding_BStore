package com.path_studio.bstore.Activities

import android.R.attr
import android.R.attr.button
import android.os.Bundle
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.transition.Visibility
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.Adapters.DetailBannerSliderAdapter
import com.path_studio.bstore.HorizontalMarginItemDecoration
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R
import org.w3c.dom.Text
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

        //Initiate OnCLick
        setAllOnClick()
    }

    private fun setAllOnClick(){
        //set button about desc onclick
        val aboutButton: ImageButton = findViewById(R.id.detailAboutArrow)
        val showLessBtn: Button = findViewById(R.id.btn_showless_desc)
        val descText:TextView = findViewById(R.id.detail_appDesc)

        aboutButton.setOnClickListener {
            val deg = changeDegree(aboutButton)
            aboutButton.animate().rotation(deg).interpolator = AccelerateDecelerateInterpolator()

            //Show more or Less Text based on current degree
            if(deg == 90f) {
                descText.maxLines = Integer.MAX_VALUE
                descText.ellipsize = null
                showLessBtn.visibility = View.VISIBLE
            }else if(deg == 0f){
                //bring back eclipse and maxline
                descText.maxLines = 2
                descText.ellipsize = TextUtils.TruncateAt.END
                showLessBtn.visibility = View.GONE
            }
            this.invalidateOptionsMenu() //Update View
        }

        //set Show less onclick
        showLessBtn.setOnClickListener {
            aboutButton.animate().rotation(0f).interpolator = AccelerateDecelerateInterpolator()

            descText.maxLines = 2
            descText.ellipsize = TextUtils.TruncateAt.END
            showLessBtn.visibility = View.GONE
            this.invalidateOptionsMenu() //Update View
        }
    }

    private fun changeDegree(aboutButton: ImageButton): Float{
        return if (aboutButton.rotation == 90f) 0f else 90f
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
        val appDesc: TextView = findViewById(R.id.detail_appDesc)
        val appRatingNum: TextView = findViewById(R.id.detail_appRating_num)
        val appRatingBar: RatingBar = findViewById(R.id.detail_appRating_bar)
        val detail_aboutApp_title: TextView = findViewById(R.id.detail_aboutApp_title)
        appBgImage = findViewById(R.id.detail_backgroundGradient)
        
        val appRatingsm: TextView = findViewById(R.id.detail_appRating_sm)
        val appSizesm: TextView = findViewById(R.id.detail_appSize_sm)
        val appIconRatedsm: ImageView = findViewById(R.id.detail_icon_ratedApp_sm)
        val appRatedsm: TextView = findViewById(R.id.detail_appRated_sm)

        val devWeb: TextView = findViewById(R.id.detail_developer_web)
        val devEmail: TextView = findViewById(R.id.detail_developer_email)
        val devAddress: TextView = findViewById(R.id.detail_developer_email)
        val devPhone: TextView = findViewById(R.id.detail_developer_phone)

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

        if(list[0].appCategory.equals("Game", true)){
            detail_aboutApp_title.text = "About this Game"
        }else{
            detail_aboutApp_title.text = "About this App"
        }

        appDesc.text = list[0].appDesc
        appRatingNum.text = list[0].ratting.toString()
        appRatingBar.rating = list[0].ratting.toFloat()
        
        appRatingsm.text = list[0].ratting.toString()

        var tempSize: String = ""
        if(list[0].appSize >= 1000){
            tempSize = (list[0].appSize / 1000).toString() + "GB"
        }else{
            tempSize = list[0].appSize.toString() + "MB"
        }
        appSizesm.text = tempSize


        var ratedIcon: Int = 0
        if(list[0].appRate == 3){
            ratedIcon = R.drawable.rated_3_plus
        }else if(list[0].appRate == 7){
            ratedIcon = R.drawable.rated_7_plus
        }else if(list[0].appRate == 12){
            ratedIcon = R.drawable.rated_12_plus
        }else if(list[0].appRate == 16){
            ratedIcon = R.drawable.rated_16_plus
        }else{
            //must be 18+
            ratedIcon = R.drawable.rated_18_plus
        }
        appIconRatedsm.setImageResource(ratedIcon)

        val tempRatedApp: String = "Rated for "+list[0].appRate+"+"
        appRatedsm.text = tempRatedApp

        devWeb.setMovementMethod(LinkMovementMethod.getInstance());
        setDevContact(devWeb, list[0].arrayDeveloperContact[0])
        setDevContact(devEmail, list[0].arrayDeveloperContact[1])
        setDevContact(devAddress, list[0].arrayDeveloperContact[2])
        setDevContact(devPhone, list[0].arrayDeveloperContact[3])
    }

    private fun setDevContact(textView: TextView, data: String){
        if(data.isEmpty()){
            textView.text = "-"
        }else{
            textView.text = data
        }
    }

    private fun showDetailBanner(listData: Array<String>, imgType: String){
        viewPager2 = findViewById<View>(R.id.detail_appImgSlider) as ViewPager2
        sliderAdapter = DetailBannerSliderAdapter(listData, this)

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
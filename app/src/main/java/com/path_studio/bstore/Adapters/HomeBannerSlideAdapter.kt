package com.path_studio.bstore.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.Interpolator
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.DoubleConverter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R


class HomeBannerSlideAdapter(val context: Context): PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var bannerDataList: ArrayList<App>

    //Arrays
    var image = intArrayOf(
            R.drawable.recommend_app_01,
            R.drawable.recommend_app_02,
            R.drawable.recommend_app_03,
            R.drawable.recommend_app_04
    )

    var appRecommendID = intArrayOf(
            5, 12, 4, 7
    )

    override fun getCount(): Int {
        return image.size
    }

    override fun isViewFromObject(view: View, o: Any): Boolean {
        return view === o as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater!!.inflate(R.layout.home_banner_slider, container, false)

        val slideImageView = view.findViewById<View>(R.id.home_banner_img) as ImageView
        slideImageView.setImageResource(image[position])

        //get data with filter
        bannerDataList = AppsData.listDataFromID(appRecommendID[position])

        val slideImageLogoView = view.findViewById<View>(R.id.homeBannerAppImg) as ImageView
        Glide.with(view)
            .load(bannerDataList[0].appLogo)
            .apply(RequestOptions().override(150, 150))
            .into(slideImageLogoView)

        val slideAppName = view.findViewById<View>(R.id.homeBannerAppName) as TextView
        slideAppName.text = bannerDataList[0].appName

        val slideDevName = view.findViewById<View>(R.id.homeBannerDevName) as TextView
        slideDevName.text = bannerDataList[0].devName

        val slideAppCategory = view.findViewById<View>(R.id.homeBannerAppCategory) as TextView
        slideAppCategory.text = bannerDataList[0].appCategory

        val slideAppRating = view.findViewById<View>(R.id.homeBannerAppRating) as TextView
        slideAppRating.text = bannerDataList[0].ratting.toString()

        val slideAppSize = view.findViewById<View>(R.id.homeBannerAppSize) as TextView
        slideAppSize.text = DoubleConverter.convertSizeToText(bannerDataList[0].appSize)

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout?)
    }

}
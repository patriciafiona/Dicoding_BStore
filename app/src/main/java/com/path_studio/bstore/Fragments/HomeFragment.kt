package com.path_studio.bstore.Fragments

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.path_studio.bstore.Activities.DetailApp
import com.path_studio.bstore.Activities.MainActivity
import com.path_studio.bstore.Adapters.HomeBannerSlideAdapter
import com.path_studio.bstore.Adapters.ListHorizontalAppAdapter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {
    private lateinit var rvTopTenApp: RecyclerView
    private var listTopTen: ArrayList<App> = arrayListOf()
    private lateinit var rvEntertainment: RecyclerView
    private var listEntertainment: ArrayList<App> = arrayListOf()
    private lateinit var rvGame: RecyclerView
    private var listGame: ArrayList<App> = arrayListOf()

    private var sliderAdapter: HomeBannerSlideAdapter? = null
    private var mSlideViewPager: ViewPager? = null
    private var mDotLayout: LinearLayout? = null

    private lateinit var mDosts: Array<TextView>
    private var nCurrentPage = 0

    var timer: Timer? = null
    val DELAY_MS: Long = 500 //delay in milliseconds before task is to be executed
    val PERIOD_MS: Long = 3000 // time in milliseconds between successive task executions.

    private lateinit var rootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_home, container, false)

        //Setting Recycle View
        settingRecycleView()

        //Setting Animation
        settingAnimation(rootView)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Show Search Bar
        (activity as MainActivity).setSearchBarVisibility(1)
        (activity as MainActivity).clearSearchBar()

        //Setting Home Banner Slide Show
        showHomeBanner(view)
    }

    private fun settingAnimation(view: View){
        //Setting Gradient Animated Background
        val constraintLayout: ConstraintLayout = view.findViewById(R.id.stayHealthBanner)
        val animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()

        //Setting Image Stay Health Animation
        val image: ImageView = view.findViewById(R.id.stayHealthImg) as ImageView
        val fadeImgAnim:Animation = AnimationUtils.loadAnimation(view.context, R.anim.fade_in)
        image.startAnimation(fadeImgAnim)

        //Setting Text Stay Health Animation
        val text: TextView = view.findViewById(R.id.stayHealthTxt) as TextView
        val fadeTxtAnim: Animation = AnimationUtils.loadAnimation(view.context, R.anim.fade_in_and_slide)
        fadeTxtAnim.startOffset = 500
        text.startAnimation(fadeTxtAnim)
    }

    private fun settingRecycleView(){
        //Top Ten Apps
        rvTopTenApp = rootView.findViewById(R.id.rv_TopTenApps)
        rvTopTenApp.setHasFixedSize(true)

        listTopTen.addAll(AppsData.listDataTenBestApp)
        showRecyclerList(rvTopTenApp, listTopTen)

        //Entertainment Apps
        rvEntertainment = rootView.findViewById(R.id.rv_appCategoryEntertainment)
        rvEntertainment.setHasFixedSize(true)

        listEntertainment.addAll(AppsData.listDataCategory("Entertainment"))
        showRecyclerList(rvEntertainment, listEntertainment)

        //Game Apps
        rvGame = rootView.findViewById(R.id.rv_appCategoryGame)
        rvGame.setHasFixedSize(true)

        listGame.addAll(AppsData.listDataCategory("Game"))
        showRecyclerList(rvGame, listGame)
    }

    private fun showHomeBanner(view: View){
        mSlideViewPager = view.findViewById<View>(R.id.homeBannerContainer) as ViewPager
        mDotLayout = view.findViewById<View>(R.id.dotsLayoutHomeBanner) as LinearLayout

        sliderAdapter = HomeBannerSlideAdapter(view.context, activity as MainActivity)
        mSlideViewPager!!.setAdapter(sliderAdapter)

        addDotsIndicator(0)
        mSlideViewPager!!.addOnPageChangeListener(viewListener)

        /*After setting the adapter use the timer */
        val handler = Handler()
        val Update = Runnable {
            if (nCurrentPage == 4) {
                nCurrentPage = 0
            }
            mSlideViewPager!!.setCurrentItem(nCurrentPage++, true)
        }

        timer = Timer() // This will create a new Thread
        timer!!.schedule(object : TimerTask() {
            // task to be scheduled
            override fun run() {
                handler.post(Update)
            }
        }, DELAY_MS, PERIOD_MS)
    }

    private fun showRecyclerList(rvApp: RecyclerView, list: ArrayList<App>) {
        rvApp.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val listAppAdapter = ListHorizontalAppAdapter(list, activity as MainActivity)
        rvApp.adapter = listAppAdapter
    }

    fun addDotsIndicator(position: Int) {
        mDotLayout!!.removeAllViews()
        mDosts = arrayOf<TextView>(
                TextView(rootView.context), TextView(rootView.context),
                TextView(rootView.context), TextView(rootView.context)
        )
        for (i in mDosts.indices) {
            mDosts[i] = TextView(rootView.context)
            mDosts[i].text = Html.fromHtml("&#8226;", 0)
            mDosts[i].textSize = 35f
            mDosts[i].setTextColor(ContextCompat.getColor(rootView.context, R.color.grey_700))
            mDotLayout!!.addView(mDosts[i])
        }
        mDosts[position].setTextColor(ContextCompat.getColor(rootView.context, R.color.blue))
    }

    var viewListener: OnPageChangeListener = object : OnPageChangeListener {
        override fun onPageScrolled(i: Int, v: Float, i1: Int) {}

        override fun onPageSelected(i: Int) {
            addDotsIndicator(i)
            nCurrentPage = i
        }

        override fun onPageScrollStateChanged(i: Int) {}
    }

}
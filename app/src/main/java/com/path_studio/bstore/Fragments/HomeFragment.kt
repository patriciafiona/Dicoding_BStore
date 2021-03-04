package com.path_studio.bstore.Fragments

import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.path_studio.bstore.Adapters.HomeBannerSlideAdapter
import com.path_studio.bstore.Adapters.ListHorizontalAppAdapter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R
import java.util.*


class HomeFragment : Fragment() {
    private lateinit var rvApp: RecyclerView
    private var list: ArrayList<App> = arrayListOf()

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
        rvApp = rootView.findViewById(R.id.rv_apps)
        rvApp.setHasFixedSize(true)

        list.addAll(AppsData.listDataTenBestApp)
        showRecyclerList()

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Setting Home Banner Slide Show
        showHomeBanner(view)
    }

    private fun showHomeBanner(view: View){
        mSlideViewPager = view.findViewById<View>(R.id.homeBannerContainer) as ViewPager
        mDotLayout = view.findViewById<View>(R.id.dotsLayoutHomeBanner) as LinearLayout

        sliderAdapter = HomeBannerSlideAdapter(view.context)
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

    private fun showRecyclerList() {
        rvApp.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val listAppAdapter = ListHorizontalAppAdapter(list)
        rvApp.adapter = listAppAdapter
    }

    fun addDotsIndicator(position: Int) {
        mDotLayout!!.removeAllViews()
        mDosts = arrayOf<TextView>(
                TextView(rootView?.context), TextView(rootView?.context),
                TextView(rootView?.context), TextView(rootView?.context)
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
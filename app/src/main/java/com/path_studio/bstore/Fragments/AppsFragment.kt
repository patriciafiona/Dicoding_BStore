package com.path_studio.bstore.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.bstore.Activities.MainActivity
import com.path_studio.bstore.Adapters.ListVerticalAppAdapter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R

class AppsFragment : Fragment() {

    private lateinit var rvApp: RecyclerView
    private var list: ArrayList<App> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Show Search Bar
        (activity as MainActivity).setSearchBarVisibility(1)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_apps, container, false)

        //show list of apps
        rvApp = rootView.findViewById(R.id.rv_fullApps)
        rvApp.setHasFixedSize(true)

        list.addAll(AppsData.listAllData)
        showRecyclerList()

        return rootView
    }

    private fun showRecyclerList() {
        rvApp.layoutManager = LinearLayoutManager(activity)
        val listAppAdapter = ListVerticalAppAdapter(list)
        rvApp.adapter = listAppAdapter
    }
}
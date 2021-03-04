package com.path_studio.bstore.Fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mancj.materialsearchbar.MaterialSearchBar
import com.mancj.materialsearchbar.MaterialSearchBar.OnSearchActionListener
import com.mancj.materialsearchbar.adapter.SuggestionsAdapter
import com.path_studio.bstore.Adapters.ListHorizontalAppAdapter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R


class HomeFragment : Fragment() {
    private lateinit var rvApp: RecyclerView
    private var list: ArrayList<App> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_home, container, false)

        rvApp = rootView.findViewById(R.id.rv_apps)
        rvApp.setHasFixedSize(true)

        list.addAll(AppsData.listData)
        showRecyclerList()

        return rootView
    }

    private fun showRecyclerList() {
        rvApp.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val listAppAdapter = ListHorizontalAppAdapter(list)
        rvApp.adapter = listAppAdapter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //
    }

}
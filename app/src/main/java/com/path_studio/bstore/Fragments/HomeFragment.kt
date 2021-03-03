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
import com.path_studio.bstore.Adapters.ListAppAdapter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R


class HomeFragment : Fragment() {
    private var lastSearches: List<String>? = null
    private val searchBar: MaterialSearchBar? = null

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
        val listAppAdapter = ListAppAdapter(list)
        rvApp.adapter = listAppAdapter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setting_search()
    }

    private fun setting_search() {
        searchBar?.setOnSearchActionListener(object : OnSearchActionListener {
            override fun onSearchStateChanged(enabled: Boolean) {}

            override fun onSearchConfirmed(text: CharSequence) {
                //startSearch(text.toString(), true, null, true);
            }

            override fun onButtonClicked(buttonCode: Int) {
                if (buttonCode == MaterialSearchBar.BUTTON_NAVIGATION) {
                    //opening or closing a navigation drawer
                } else if (buttonCode == MaterialSearchBar.BUTTON_BACK) {
                    searchBar?.closeSearch()
                }
            }
        })
        searchBar?.addTextChangeListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                //Check data in list
                val search: String = searchBar?.getText()
                if (TextUtils.isEmpty(search)) {
                    /*//Clear current list
                    list.clear()

                    //Show all data in list
                    list.addAll(MobilData.getListData())
                    showRecyclerList()*/
                } else {
                    /*//Clear current list
                    list.clear()

                    //Show all data in list
                    list.addAll(MobilData.getFilterText(search))
                    showRecyclerList()*/
                }
            }

            override fun afterTextChanged(s: Editable) {
                //
            }
        })
        searchBar?.setSuggestionsClickListener(object :
            SuggestionsAdapter.OnItemViewClickListener {
            override fun OnItemClickListener(position: Int, v: View) {}
            override fun OnItemDeleteListener(position: Int, v: View) {}
        })
    }

}
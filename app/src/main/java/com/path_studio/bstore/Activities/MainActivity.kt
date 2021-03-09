package com.path_studio.bstore.Activities

import android.app.AlertDialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mancj.materialsearchbar.MaterialSearchBar
import com.mancj.materialsearchbar.adapter.SuggestionsAdapter
import com.path_studio.bstore.Adapters.CustomSuggestionsAdapter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity(), MaterialSearchBar.OnSearchActionListener {

    private var lastSearches: List<String>? = null
    private lateinit var searchBar: MaterialSearchBar
    private var list: ArrayList<App>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting the Bottom Navigator
        setBottomNav()

        //set Material Search Bar
        settingSearch()
    }

    private fun setBottomNav(){
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        val appBarConfiguration = AppBarConfiguration.Builder(
                R.id.navigation_home,
                R.id.navigation_apps,
                R.id.navigation_about,
        )
            .build()
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)
    }

    private fun settingSearch() {
        searchBar = findViewById(R.id.searchBar)
        searchBar.setMaxSuggestionCount(5)

        //enable search bar callbacks
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val customSuggestionsAdapter = CustomSuggestionsAdapter(inflater, this@MainActivity)

        searchBar.setOnSearchActionListener(object : MaterialSearchBar.OnSearchActionListener {
            override fun onSearchStateChanged(enabled: Boolean) {}

            override fun onSearchConfirmed(text: CharSequence) {
                //startSearch(text.toString(), true, null, true);
            }

            override fun onButtonClicked(buttonCode: Int) {
                if (buttonCode == MaterialSearchBar.BUTTON_NAVIGATION) {
                    //opening or closing a navigation drawer
                } else if (buttonCode == MaterialSearchBar.BUTTON_BACK) {
                    searchBar.clearSuggestions()
                    searchBar.closeSearch()
                }
            }
        })
        searchBar.addTextChangeListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                searchBar.setCustomSuggestionAdapter(customSuggestionsAdapter)

                if (searchBar.text.isNotEmpty()) {
                    if (searchBar.text.length > 1) {
                        //get data that contain searchBar.text
                        list = AppsData.listDataFromName(searchBar.text)
                        customSuggestionsAdapter.suggestions = list
                        searchBar.showSuggestionsList()
                    }
                } else {
                    searchBar.clearSuggestions()
                    searchBar.hideSuggestionsList()
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
        searchBar.setSuggestionsClickListener(object :
                SuggestionsAdapter.OnItemViewClickListener {
            override fun OnItemClickListener(position: Int, v: View) {}
            override fun OnItemDeleteListener(position: Int, v: View) {}
        })

    }

    override fun onResume() {
        super.onResume()
        clearSearchBar()
    }

    fun clearSearchBar(){
        searchBar = findViewById(R.id.searchBar)
        if(searchBar.isSearchOpened){
            searchBar.clearSuggestions()
            searchBar.closeSearch()
        }

    }

    fun setSearchBarVisibility(status: Int){
        val searchBar:MaterialSearchBar = this.findViewById(R.id.searchBar)
        when(status){
            0 -> {
                searchBar.visibility = View.GONE
            }
            1 -> {
                searchBar.visibility = View.VISIBLE
            }
        }
    }

    override fun onBackPressed() {
        val alert = AlertDialog.Builder(this)
        alert.setMessage(R.string.exit_app)
        alert.setCancelable(false)
        alert.setPositiveButton(android.R.string.yes) { dialogInterface, i -> //exit app
            finishAndRemoveTask()
            exitProcess(0)
        }
        alert.setNegativeButton(android.R.string.no) { dialogInterface, i -> dialogInterface.dismiss() }
        alert.show()
    }

    override fun onSearchStateChanged(enabled: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onSearchConfirmed(text: CharSequence?) {
        TODO("Not yet implemented")
    }

    override fun onButtonClicked(buttonCode: Int) {
        TODO("Not yet implemented")
    }
}
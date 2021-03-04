package com.path_studio.bstore.Activities

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mancj.materialsearchbar.MaterialSearchBar
import com.mancj.materialsearchbar.adapter.SuggestionsAdapter
import com.path_studio.bstore.R

class MainActivity : AppCompatActivity() {

    private var lastSearches: List<String>? = null
    private val searchBar: MaterialSearchBar? = null

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
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.navigation_home,
            R.id.navigation_rankings,
            R.id.navigation_apps,
            R.id.navigation_about,
            R.id.navigation_settings
        )
            .build()
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)
    }

    private fun settingSearch() {
        searchBar?.setOnSearchActionListener(object : MaterialSearchBar.OnSearchActionListener {
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
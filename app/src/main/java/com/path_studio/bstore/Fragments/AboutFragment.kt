package com.path_studio.bstore.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.path_studio.bstore.Activities.MainActivity
import com.path_studio.bstore.R


class AboutFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Hide Search Bar
        (activity as MainActivity).setSearchBarVisibility(0)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        //set Button On Click
        setOnCLick(view)
        return view
    }

    private fun setOnCLick(view: View){
        val fbButtonIcon: ImageButton = view.findViewById(R.id.sm_facebook)
        val igIconButton: ImageButton = view.findViewById(R.id.sm_instagram)
        val githubIconButton: ImageButton = view.findViewById(R.id.sm_github)
        val linkedInIconButton: ImageButton = view.findViewById(R.id.sm_linkedIn)

        fbButtonIcon.setOnClickListener{
            goToUrl("https://www.facebook.com/patricia.fiona.7")
        }

        igIconButton.setOnClickListener {
            goToUrl("https://www.instagram.com/path.patricia15/")
        }

        githubIconButton.setOnClickListener {
            goToUrl("https://github.com/patriciafiona")
        }

        linkedInIconButton.setOnClickListener {
            goToUrl("https://www.linkedin.com/in/patricia-fiona-6132861a3/")
        }
    }

    private fun goToUrl(url: String) {
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

}
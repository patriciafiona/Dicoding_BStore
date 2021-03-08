package com.path_studio.bstore.Adapters
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mancj.materialsearchbar.adapter.SuggestionsAdapter
import com.path_studio.bstore.Activities.DetailApp
import com.path_studio.bstore.Activities.MainActivity
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.R


class CustomSuggestionsAdapter(inflater: LayoutInflater?, val activity: MainActivity) : SuggestionsAdapter<App, CustomSuggestionsAdapter.SuggestionHolder>(inflater) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomSuggestionsAdapter.SuggestionHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_suggestion, parent, false)
        return SuggestionHolder(view)
    }

    override fun onBindSuggestionHolder(suggestion: App, holder: CustomSuggestionsAdapter.SuggestionHolder, position: Int) {
        holder.appName.text = suggestion.appName

        Glide.with(holder.itemView.context)
                .load(suggestion.appLogo)
                .apply(RequestOptions().override(150, 150))
                .into(holder.appLogo)

        holder.itemView.setOnClickListener {
            //Toast.makeText(holder.itemView.context, "You Choose: " + listApp.get(holder.adapterPosition).appName, Toast.LENGTH_SHORT).show()
            //show detail page
            val i = Intent(activity, DetailApp::class.java)
            i.putExtra("appID", suggestion.appID)
            activity.startActivity(i)
        }
    }

    override fun getSingleViewHeight(): Int {
        return 60
    }

    inner class SuggestionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var appName: TextView = itemView.findViewById(R.id.suggestion_appName)
        var appLogo: ImageView = itemView.findViewById(R.id.suggestion_appLogo)
    }

}
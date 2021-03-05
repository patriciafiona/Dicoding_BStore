package com.path_studio.bstore.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.Activities.DetailApp
import com.path_studio.bstore.Activities.MainActivity
import com.path_studio.bstore.DoubleConverter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.Model.AppsData
import com.path_studio.bstore.R

class ListHorizontalAppAdapter(val listApp: ArrayList<App>, val activity: MainActivity) : RecyclerView.Adapter<ListHorizontalAppAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_col_app, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val app = listApp[position]

        Glide.with(holder.itemView.context)
            .load(app.appLogo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.dispAppLogo)

        holder.dispAppName.text = app.appName

        //App Size
        holder.dispAppSize.text = DoubleConverter.convertSizeToText(app.appSize)

        holder.itemView.setOnClickListener {
            //Toast.makeText(holder.itemView.context, "You Choose: " + listApp.get(holder.adapterPosition).appName, Toast.LENGTH_SHORT).show()
            //show detail page
            val i = Intent(activity, DetailApp::class.java)
            i.putExtra("appData", AppsData.listDataFromID(listApp.get(holder.adapterPosition).appID))
            activity.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return listApp.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var dispAppName: TextView = itemView.findViewById(R.id.appName_item_col_disp)
        var dispAppSize: TextView = itemView.findViewById(R.id.appSize_item_col_disp)
        var dispAppLogo: ImageView = itemView.findViewById(R.id.img_item_col_disp)
    }
}
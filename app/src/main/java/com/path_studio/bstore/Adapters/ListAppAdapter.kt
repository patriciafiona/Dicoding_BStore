package com.path_studio.bstore.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.R
import java.net.URI

class ListAppAdapter (val listApp: ArrayList<App>) : RecyclerView.Adapter<ListAppAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_col_app, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val app = listApp[position]
        //var appLogoURI: URI = URI.create(app.appLogo)
        Glide.with(holder.itemView.context)
            .load(app.appLogo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.dispAppLogo)

        holder.dispAppName.text = app.appName
    }

    override fun getItemCount(): Int {
        return listApp.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var dispAppName: TextView = itemView.findViewById(R.id.appName_item_col_disp)
        //var dispDevName: TextView = itemView.findViewById(R.id.tv_item_detail)
        var dispAppLogo: ImageView = itemView.findViewById(R.id.img_item_col_disp)
    }
}
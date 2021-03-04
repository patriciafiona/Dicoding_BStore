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

class ListVerticalAppAdapter (val listApp: ArrayList<App>) : RecyclerView.Adapter<ListVerticalAppAdapter.ListViewHolder>(){
    private var rattingResult: String = ""
    private var appSizeResult: String = ""

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_app, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val app = listApp[position]

        Glide.with(holder.itemView.context)
                .load(app.appLogo)
                .apply(RequestOptions().override(150, 150))
                .into(holder.dispAppLogo)

        holder.dispAppName.text = app.appName
        holder.dispDevName.text = app.devName
        holder.dispAppCategory.text = app.appCategory

        //Ratting
        rattingResult = app.ratting.toString()
        holder.dispAppRating.text = rattingResult

        //App Size
        var tempAppSize: Double = app.appSize
        if(tempAppSize>=1000)
            appSizeResult = "${tempAppSize.toString()} GB"
        else
            appSizeResult = "${tempAppSize.toString()} MB"
        holder.dispAppSize.text = appSizeResult
    }

    override fun getItemCount(): Int {
        return listApp.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var dispAppName: TextView = itemView.findViewById(R.id.appName_item_row_disp)
        var dispDevName: TextView = itemView.findViewById(R.id.devName_item_row_disp)
        var dispAppCategory: TextView = itemView.findViewById(R.id.appCategory_item_row_disp)
        var dispAppSize: TextView = itemView.findViewById(R.id.appSize_item_row_disp)
        var dispAppRating: TextView = itemView.findViewById(R.id.appRatting_item_row_disp)
        var dispAppLogo: ImageView = itemView.findViewById(R.id.img_item_row_disp)
    }
}
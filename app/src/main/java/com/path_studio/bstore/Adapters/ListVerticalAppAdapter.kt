package com.path_studio.bstore.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.Activities.DetailApp
import com.path_studio.bstore.Activities.MainActivity
import com.path_studio.bstore.DoubleConverter
import com.path_studio.bstore.Model.App
import com.path_studio.bstore.R

class ListVerticalAppAdapter (val listApp: ArrayList<App>, val activity: MainActivity) : RecyclerView.Adapter<ListVerticalAppAdapter.ListViewHolder>(){
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
        holder.dispAppSize.text = DoubleConverter.convertSizeToText(app.appSize)

        holder.itemView.setOnClickListener {
            //Toast.makeText(holder.itemView.context, "You Choose: " + listApp.get(holder.adapterPosition).appName, Toast.LENGTH_SHORT).show()
            //show detail page
            val i = Intent(activity, DetailApp::class.java)
            i.putExtra("appID", listApp[holder.adapterPosition].appID)
            activity.startActivity(i)
        }
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
package com.path_studio.bstore.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.path_studio.bstore.Activities.DetailApp
import com.path_studio.bstore.Activities.ImageViewDetailActivity
import com.path_studio.bstore.R

class DetailBannerSliderAdapter(val image: Array<String>, val activity: DetailApp): RecyclerView.Adapter<DetailBannerSliderAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.detail_banner_slider, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(image[position])
            .apply(RequestOptions().override(700, 700))
            .into(holder.slideImageView)

        holder.slideImageView.setOnClickListener {
            val i = Intent(activity, ImageViewDetailActivity::class.java)
            i.putExtra("imageURL", image[position])
            activity.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return image.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val slideImageView:ImageView = itemView.findViewById(R.id.detail_banner_img)
    }
}
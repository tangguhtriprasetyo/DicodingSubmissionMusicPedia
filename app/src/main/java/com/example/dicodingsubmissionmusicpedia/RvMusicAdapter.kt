package com.example.dicodingsubmissionmusicpedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RvMusicAdapter(private val listMusic: ArrayList<Music>) :
    RecyclerView.Adapter<RvMusicAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_desc)
        var imgBandPhoto: ImageView = itemView.findViewById(R.id.img_item_band_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_rv_music, parent, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val music = listMusic[position]

        Glide.with(holder.itemView.context)
            .load(music.img_band)
            .apply(RequestOptions().override(64, 64))
            .into(holder.imgBandPhoto)

        holder.tvName.text = music.name
        holder.tvDescription.text = music.description

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listMusic[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listMusic.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Music)
    }
}
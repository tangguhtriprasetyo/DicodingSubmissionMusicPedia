package com.example.dicodingsubmissionmusicpedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*
import kotlin.collections.ArrayList

class RvMusicAdapter(private val listMusic: ArrayList<Music>) :
        RecyclerView.Adapter<RvMusicAdapter.ListViewHolder>(), Filterable {
    private lateinit var onItemClickCallback: OnItemClickCallback

    var filterList = ArrayList<Music>()

    init {
        filterList = listMusic
    }

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
        val music = filterList[position]

        Glide.with(holder.itemView.context)
            .load(music.img_band)
            .apply(RequestOptions().override(64, 64))
            .into(holder.imgBandPhoto)

        holder.tvName.text = music.name
        holder.tvDescription.text = music.description

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(filterList[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return filterList.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Music)
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    filterList = listMusic
                } else {
                    val resultList = ArrayList<Music>()
                    for (row in listMusic) {
                        if (row.name.toLowerCase(Locale.ROOT).contains(charSearch.toLowerCase(Locale.ROOT))) {
                            resultList.add(row)
                        }
                    }
                    filterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = filterList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                filterList = results?.values as ArrayList<Music>
                notifyDataSetChanged()
            }

        }
    }
}
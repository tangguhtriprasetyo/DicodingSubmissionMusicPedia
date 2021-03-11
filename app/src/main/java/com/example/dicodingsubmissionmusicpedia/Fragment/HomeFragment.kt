package com.example.dicodingsubmissionmusicpedia.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingsubmissionmusicpedia.Activity.DetailActivity
import com.example.dicodingsubmissionmusicpedia.Music
import com.example.dicodingsubmissionmusicpedia.MusicData
import com.example.dicodingsubmissionmusicpedia.R
import com.example.dicodingsubmissionmusicpedia.RvMusicAdapter

class HomeFragment : Fragment() {
    private lateinit var rvMusic: RecyclerView
    private lateinit var searchView: SearchView
    private var list: ArrayList<Music> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        rvMusic = view.findViewById(R.id.rv_music)
        rvMusic.setHasFixedSize(true)

        searchView = view.findViewById(R.id.search_view)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.addAll(MusicData.listData)
        rvMusic.apply {
            showRecyclerData()
        }
    }

    private fun showRecyclerData() {
        rvMusic.layoutManager = LinearLayoutManager(activity)
        val rvMusicAdapter = RvMusicAdapter(list)
        rvMusic.adapter = rvMusicAdapter

        rvMusicAdapter.setOnItemClickCallback(object : RvMusicAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Music) {
                showSelectedMusic(data)
            }
        })

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                rvMusicAdapter.filter.filter(newText)
                return false
            }
        })
    }

    private fun showSelectedMusic(data: Music) {

        Toast.makeText(activity, "Kamu memilih ${data.name}", Toast.LENGTH_SHORT).show()
        val intentDetail = Intent(activity, DetailActivity::class.java)
        val bundle = Bundle()
        bundle.putString("name", data.name)
        bundle.putString("img_band", data.img_band)
        bundle.putString("date", data.date)
        bundle.putString("member", data.member)
        bundle.putString("description", data.description)
        bundle.putString("linkWebsite", data.linkWebsite)
        bundle.putString("top_img1", data.top_img1)
        bundle.putString("top_title1", data.top_title1)
        bundle.putString("top_date1", data.top_date1)
        bundle.putString("top_img2", data.top_img2)
        bundle.putString("top_title2", data.top_title2)
        bundle.putString("top_date2", data.top_date2)
        bundle.putString("top_img3", data.top_img3)
        bundle.putString("top_title3", data.top_title3)
        bundle.putString("top_date3", data.top_date3)
        intentDetail.putExtras(bundle)
        startActivity(intentDetail)

    }

}
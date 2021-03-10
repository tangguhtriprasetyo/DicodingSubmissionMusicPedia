package com.example.dicodingsubmissionmusicpedia.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
    private var list: ArrayList<Music> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        rvMusic = view.findViewById(R.id.rv_music)
        rvMusic.setHasFixedSize(true)

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
    }

    private fun showSelectedMusic(data: Music) {

        Toast.makeText(activity, "Kamu memilih ${data.name}", Toast.LENGTH_SHORT).show()
        val intent = Intent(activity, DetailActivity::class.java)
        startActivity(intent)

    }

}
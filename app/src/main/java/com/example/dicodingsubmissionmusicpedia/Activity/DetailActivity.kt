package com.example.dicodingsubmissionmusicpedia.Activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.dicodingsubmissionmusicpedia.R

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var linkWebsite: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnWebsite: Button = findViewById(R.id.btn_web)
        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val tvTitle: TextView = findViewById(R.id.tv_title_detail)
        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvDate: TextView = findViewById(R.id.tv_detail_date)
        val tvMembers: TextView = findViewById(R.id.tv_detail_members)
        val tvDescription: TextView = findViewById(R.id.tv_detail_desc)
        val imgDetail: ImageView = findViewById(R.id.img_detail)

        val tvTitleAlbum1: TextView = findViewById(R.id.tv_title_album1)
        val tvDateAlbum1: TextView = findViewById(R.id.tv_date_album1)
        val imgAlbum1: ImageView = findViewById(R.id.img_album1)

        val tvTitleAlbum2: TextView = findViewById(R.id.tv_title_album2)
        val tvDateAlbum2: TextView = findViewById(R.id.tv_date_album2)
        val imgAlbum2: ImageView = findViewById(R.id.img_album2)

        val tvTitleAlbum3: TextView = findViewById(R.id.tv_title_album3)
        val tvDateAlbum3: TextView = findViewById(R.id.tv_date_album3)
        val imgAlbum3: ImageView = findViewById(R.id.img_album3)

        btnWebsite.setOnClickListener(this)
        btnBack.setOnClickListener(this)

        if (intent.hasExtra("name")) {
            val name = intent.getStringExtra("name")
            val date = intent.getStringExtra("date")
            val members = intent.getStringExtra("member")
            val description = intent.getStringExtra("description")
            val imgBand = intent.getStringExtra("img_band")
            linkWebsite = intent.getStringExtra("linkWebsite")!!

            val titleAlbum1 = intent.getStringExtra("top_title1")
            val dateAlbum1 = intent.getStringExtra("top_date1")
            val linkImgAlbum1 = intent.getStringExtra("top_img1")

            val titleAlbum2 = intent.getStringExtra("top_title2")
            val dateAlbum2 = intent.getStringExtra("top_date2")
            val linkImgAlbum2 = intent.getStringExtra("top_img2")

            val titleAlbum3 = intent.getStringExtra("top_title3")
            val dateAlbum3 = intent.getStringExtra("top_date3")
            val linkImgAlbum3 = intent.getStringExtra("top_img3")

            tvName.text = name
            tvTitle.text = name
            tvDate.text = date
            tvMembers.text = members
            tvDescription.text = description
            tvTitleAlbum1.text = titleAlbum1
            tvDateAlbum1.text = dateAlbum1
            tvTitleAlbum2.text = titleAlbum2
            tvDateAlbum2.text = dateAlbum2
            tvTitleAlbum3.text = titleAlbum3
            tvDateAlbum3.text = dateAlbum3

            Glide.with(imgDetail)
                    .load(imgBand)
                    .into(imgDetail)

            Glide.with(imgAlbum1)
                    .load(linkImgAlbum1)
                    .into(imgAlbum1)

            Glide.with(imgAlbum2)
                    .load(linkImgAlbum2)
                    .into(imgAlbum2)

            Glide.with(imgAlbum3)
                    .load(linkImgAlbum3)
                    .into(imgAlbum3)

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_web -> {
                val intentWeb = Intent(Intent.ACTION_VIEW, Uri.parse(linkWebsite))
                startActivity(intentWeb)
            }
            R.id.btn_back -> {
                finish()
            }
        }
    }
}
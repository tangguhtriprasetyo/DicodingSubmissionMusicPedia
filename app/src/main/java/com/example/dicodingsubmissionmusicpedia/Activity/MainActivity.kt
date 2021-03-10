package com.example.dicodingsubmissionmusicpedia.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.dicodingsubmissionmusicpedia.Fragment.HomeFragment
import com.example.dicodingsubmissionmusicpedia.Fragment.ProfileFragment
import com.example.dicodingsubmissionmusicpedia.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation_bar)

        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()

        setCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(homeFragment)
                R.id.profile -> setCurrentFragment(profileFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.display_fragment, fragment)
            commit()
        }
    }
}
package com.example.myprojectdevmobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


@Suppress("DEPRECATION")
class Home_1 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)





        val bottomm = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottomNavigationView)
        val homeFragment = HomeFragment()
        val bestFragment = BestofFragment()
        val FlowerFragment = FlowersFragment()
        val skyFragment = SkyFragment()

        makeCurrentFragment(homeFragment)

        bottomm.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.Home -> makeCurrentFragment(homeFragment)
                R.id.sky -> makeCurrentFragment(skyFragment)
                R.id.Flowers -> makeCurrentFragment(FlowerFragment)
                R.id.Best -> makeCurrentFragment(bestFragment)
            }
            true
        }

    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, fragment)
            commit()
        }
}
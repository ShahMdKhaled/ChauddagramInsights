package com.noorsoftsolution.chauddagraminsights

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import me.ibrahimsn.lib.SmoothBottomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val drawerlay: DrawerLayout = findViewById(R.id.drawerlay)
        val materialToolbar: MaterialToolbar = findViewById(R.id.materialToolbar)
        val navigationView: NavigationView = findViewById(R.id.navigationView)
        val bottomBar: SmoothBottomBar = findViewById(R.id.bottomBar)

        // Drawer Toggle Setup
        val toggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerlay,
            materialToolbar,
            R.string.Drawer_close,
            R.string.Drawer_open
        )
        drawerlay.addDrawerListener(toggle)

        // Default Home Fragment Load
        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }

        // Navigation Drawer Menu Click Listener
        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home1 -> {
                    loadFragment(HomeFragment())
                }
               // R.id.shorts -> {
                  //  loadFragment(ShortsFragment()) // Create this fragment
               // }
            }
            drawerlay.closeDrawer(GravityCompat.START)
            true
        }

        // **Bottom Navigation Click Listener**
        bottomBar.onItemSelected = { position ->
            when (position) {
                0 -> loadFragment(HomeFragment()) // প্রথম আইটেম (Home)
                //1 -> loadFragment(ShortsFragment()) // দ্বিতীয় আইটেম (Shorts)
                //2 -> loadFragment(ProfileFragment()) // তৃতীয় আইটেম (Profile)
            }
        }
    }

    // Fragment Load Function
    private fun loadFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLay, fragment)
            .commit()
    }
}

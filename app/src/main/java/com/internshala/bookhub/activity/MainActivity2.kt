package com.internshala.bookhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var drawer : DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar:Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

    //    drawer =  findViewById(R.id.DrawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
     //   frameLayout = findViewById(R.id.frameLayout)
        navigationView = findViewById(R.id.navigationView)
        setUpToolbar()

        var actionBarDrawerToggle = ActionBarDrawerToggle(this@MainActivity2, drawer, R.string.open_drawer, R.string.close_drawer)
        drawer.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.dashboard ->{
                    Toast.makeText(this@MainActivity2, "Clicked on Dashboard", Toast.LENGTH_SHORT).show()
                }
                R.id.favourites ->{
                    Toast.makeText(this@MainActivity2, "Clicked on Favorites", Toast.LENGTH_SHORT).show()
                }
                R.id.profile ->{
                    Toast.makeText(this@MainActivity2, "Clicked on Profile", Toast.LENGTH_SHORT).show()
                }
                R.id.aboutApp ->{
                    Toast.makeText(this@MainActivity2, "Clicked on About App", Toast.LENGTH_SHORT).show()
                }
            }
            return@setNavigationItemSelectedListener true
        }
    }
    fun setUpToolbar()
    {
        setSupportActionBar(toolbar)
        supportActionBar?.title="Book Hub"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id==android.R.id.home)
        {
            drawer.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }
}
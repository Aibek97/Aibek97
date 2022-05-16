package com.example.washdriver2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.washdriver2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_menu.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this

        drawerLayout = drawer_layout

        val navHost =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHost.navController

        val navInflater = navController.navInflater
        val graph = navInflater.inflate(R.navigation.driver_navigation)

        navController.addOnDestinationChangedListener { _, destination, _ ->

            if (destination.id == R.id.firstFragment ||
                destination.id == R.id.loginFragment ||
                destination.id == R.id.fullDriverRegistrationFragment ||
                destination.id == R.id.numberVerificationFragment ||
                destination.id == R.id.driverRegistrationFragment ||
                destination.id == R.id.forgetFragment ||
                destination.id == R.id.newUserFragment


            ) {
                menu_btn.visibility = View.GONE
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

            } else{
                menu_btn.visibility = View.VISIBLE
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            }
        }

        navController.graph = graph
        navView.setupWithNavController(navController)

        menu_btn.setOnClickListener {
            drawer_layout.openDrawer(GravityCompat.START)
        }
        closeMenu.setOnClickListener {
            drawer_layout.closeDrawers()
        }

    }

    companion object{
        private lateinit var drawerLayout: DrawerLayout
    }

}
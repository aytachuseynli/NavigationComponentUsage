package com.aytachuseynli.navigationcomponentusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.aytachuseynli.navigationcomponentusage.databinding.BottomScreenBinding
import com.aytachuseynli.navigationcomponentusage.databinding.DrawerScreenBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: DrawerScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DrawerScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragmentDrawer) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView,navHostFragment.navController)

        binding.toolbar.title = "Drawer Usage"

        val toggle = ActionBarDrawerToggle(this,binding.drawer, binding.toolbar,
        0,0)

        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (binding.drawer.isDrawerOpen(GravityCompat.START)){//Navigation Open

        }else{//Navigation Close
            super.onBackPressed()

        }
    }
}
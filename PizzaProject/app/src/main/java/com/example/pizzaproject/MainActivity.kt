package com.example.pizzaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.pizzaproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        APP = this

        navController = Navigation.findNavController(this, R.id.nav_fragment)

        binding.navView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.navigation_menu -> {
                    navController.navigate(R.id.menuFragment)
                }
                R.id.navigation_profile -> {
                    navController.navigate(R.id.profileFragment)
                }
                R.id.navigation_cart -> {
                    navController.navigate(R.id.cartFragment)
                }
            }
            true
        }

    }
}
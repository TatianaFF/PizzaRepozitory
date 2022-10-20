package com.example.pizzaproject.screens.profile

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class ProfileViewModel (application: Application) : AndroidViewModel(application) {

    fun titleFragment(): String{
        return "Profile Fragment"
    }
}
package com.example.pizzaproject.screens.cart

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class CartViewModel(application: Application) : AndroidViewModel(application) {

    fun titleFragment(): String{
        return "Cart Fragment"
    }
}
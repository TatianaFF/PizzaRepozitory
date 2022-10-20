package com.example.pizzaproject.models

import android.graphics.drawable.Drawable
import java.io.Serializable

data class PizzaModel(
    var id: Long = 0,
    var title: String = "",
    var description: String = "",
    var price: Int = 0,
    var drawable: Drawable?
) : Serializable

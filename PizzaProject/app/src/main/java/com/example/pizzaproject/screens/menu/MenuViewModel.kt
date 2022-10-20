package com.example.pizzaproject.screens.menu

import android.app.Application
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import com.example.pizzaproject.R
import com.example.pizzaproject.models.PizzaModel

class MenuViewModel(application: Application) : AndroidViewModel(application) {

    val context = application

    fun titleFragment(): String{
        return "Menu Fragment"
    }

    fun getListPizza():MutableList<PizzaModel>{
        val listPizzas = mutableListOf<PizzaModel>(
            PizzaModel(0,"Ветчина и грибы", "Ветчина, шампиньоны, увеличенная порция моцареллы, томатный соус", 345, ContextCompat.getDrawable(context, R.drawable.vetchina)),
            PizzaModel(1,"Баварские колбаски", "Баварские колбаски, ветчина, пикантная пепперони, острая чоризо, томатный соус", 346, ContextCompat.getDrawable(context, R.drawable.bavarskie)),
            PizzaModel(2,"Нежный лосось", "Лосось, томаты, оливки, соус песто, помидорки черри", 347, ContextCompat.getDrawable(context, R.drawable.vetchina)),
            PizzaModel(3,"Ветчина и грибы", "Ветчина, шампиньоны, увеличенная порция моцареллы, томатный соус", 345, ContextCompat.getDrawable(context, R.drawable.vetchina)),
            PizzaModel(4,"Баварские колбаски", "Баварские колбаски, ветчина, пикантная пепперони, острая чоризо, томатный соус", 346, ContextCompat.getDrawable(context, R.drawable.bavarskie)),
            PizzaModel(5,"Нежный лосось", "Лосось, томаты, оливки, соус песто, помидорки черри", 347, ContextCompat.getDrawable(context, R.drawable.vetchina))
        )

        return listPizzas
    }

}
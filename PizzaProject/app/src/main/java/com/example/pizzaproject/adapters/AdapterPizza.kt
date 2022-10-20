package com.example.pizzaproject.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaproject.R
import com.example.pizzaproject.models.PizzaModel
import kotlinx.android.synthetic.main.item_pizza.view.*

class AdapterPizza : RecyclerView.Adapter<AdapterPizza.PizzaViewHolder>() {

    var listPizzas = ArrayList<PizzaModel>()

    class PizzaViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pizza, parent, false)
        return PizzaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val title = holder.itemView.title_pizza
        val img = holder.itemView.image_item_pizza
        val description = holder.itemView.description_pizza
        val price = holder.itemView.price_pizza

        val pizzaCurrent = listPizzas[position]

        title.text = pizzaCurrent.title
        img.setImageDrawable(pizzaCurrent.drawable)
        description.text = pizzaCurrent.description
        price.text= "от ${pizzaCurrent.price} р"


    }

    override fun getItemCount(): Int {
        return listPizzas.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setListPizza(list: ArrayList<PizzaModel>){
        listPizzas = list
        notifyDataSetChanged()
    }

}
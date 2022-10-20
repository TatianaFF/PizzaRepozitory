package com.example.pizzaproject.screens.menu

import android.view.LayoutInflater
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaproject.adapters.AdapterPizza
import com.example.pizzaproject.databinding.FragmentMenuBinding
import com.example.pizzaproject.models.PizzaModel

class MenuFragment : Fragment() {

    private val TAG = this.javaClass.simpleName
    private lateinit var binding: FragmentMenuBinding
    private lateinit var rvPizza: RecyclerView
    private var adapter: AdapterPizza = AdapterPizza()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater, container, false)

        rvPizza = binding.rvPizza
        rvPizza.adapter = adapter



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this)[MenuViewModel::class.java]

        val listPizzas = viewModel.getListPizza()

        adapter.setListPizza(listPizzas as ArrayList<PizzaModel>)
    }

}
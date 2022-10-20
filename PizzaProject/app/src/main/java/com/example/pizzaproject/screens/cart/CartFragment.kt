package com.example.pizzaproject.screens.cart

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.pizzaproject.R
import com.example.pizzaproject.databinding.FragmentCartBinding
import com.example.pizzaproject.databinding.FragmentMenuBinding
import com.example.pizzaproject.screens.menu.MenuViewModel

class CartFragment : Fragment() {

    private val TAG = this.javaClass.simpleName
    private lateinit var binding: FragmentCartBinding
    private lateinit var tvCart: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(layoutInflater, container, false)

        tvCart = binding.tvCart

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this)[CartViewModel::class.java]

        tvCart.text = viewModel.titleFragment()
    }
}
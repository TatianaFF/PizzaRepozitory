package com.example.pizzaproject.screens.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.pizzaproject.R
import com.example.pizzaproject.databinding.FragmentMenuBinding
import com.example.pizzaproject.databinding.FragmentProfileBinding
import com.example.pizzaproject.screens.menu.MenuViewModel

class ProfileFragment : Fragment() {

    private val TAG = this.javaClass.simpleName
    private lateinit var binding: FragmentProfileBinding
    private lateinit var tvProfile: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)

        tvProfile = binding.tvProfile

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]

        tvProfile.text = viewModel.titleFragment()
    }

}
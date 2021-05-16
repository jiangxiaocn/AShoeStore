package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.LoginFragmentBinding
import com.udacity.shoestore.databinding.ShoeDetailsFragmentBinding

class shoeDetailFragment :Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : ShoeDetailsFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_details_fragment,container,false)
        binding.cancel.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(shoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        }
        binding.save.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(shoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        }
        return binding.root
    }
}
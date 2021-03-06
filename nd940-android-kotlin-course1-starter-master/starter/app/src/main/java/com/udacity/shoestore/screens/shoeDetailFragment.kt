package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeDetailsFragmentBinding
import com.udacity.shoestore.models.ShoeListViewModel
import androidx.fragment.app.activityViewModels
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.shoe_details_fragment.*

class shoeDetailFragment :Fragment(){
    private val viewModel : ShoeListViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : ShoeDetailsFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_details_fragment,container,false)
        binding.shoeListViewModel=viewModel

        binding.cancel.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(shoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        }
        binding.save.setOnClickListener{
            viewModel.addShoeToList(viewModel.newShoe.value!!)
            NavHostFragment.findNavController(this).navigate(shoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        }
        return binding.root
    }
}

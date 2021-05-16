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
import com.udacity.shoestore.databinding.InstructionFragmentBinding
import com.udacity.shoestore.databinding.LoginFragmentBinding
import com.udacity.shoestore.databinding.WelcomeFragmentBinding

class instructionFragment :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : InstructionFragmentBinding  = DataBindingUtil.inflate(inflater, R.layout.instruction_fragment,container,false)
        binding.next.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(instructionFragmentDirections.actionInstructionFragmentToShoeListFragment())
        }
        return binding.root
    }
}
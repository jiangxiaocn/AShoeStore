package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.LoginFragmentBinding

class loginFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : LoginFragmentBinding =  DataBindingUtil.inflate(inflater, R.layout.login_fragment,container,false)
        binding.LogIn.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(loginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }
        return binding.root
    }
}
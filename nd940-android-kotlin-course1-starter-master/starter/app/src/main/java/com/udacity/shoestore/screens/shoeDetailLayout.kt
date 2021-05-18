package com.udacity.shoestore.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeDetailsFragmentBinding
import com.udacity.shoestore.databinding.ShoeItemFragmentBinding
import com.udacity.shoestore.databinding.WelcomeFragmentBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.models.shoeListViewModel
import kotlinx.android.synthetic.main.shoe_details_fragment.*
import kotlinx.android.synthetic.main.shoe_details_fragment.view.*
import kotlinx.android.synthetic.main.shoe_item_fragment.view.*


class shoeDetailLayout(context: Context?) : LinearLayout(context) {

        val binding: ShoeItemFragmentBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.shoe_item_fragment, this,false)

        fun updateShoe(shoe: Shoe) {
            binding.apply {
                addView(this.root)
                shoe_name.text=shoe.name
                shoe_decription.text=shoe.description
                shoe_size.text = shoe.size.toString()

            }
        }
    }

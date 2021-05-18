package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.InstructionFragmentBinding
import com.udacity.shoestore.databinding.ShoeListFragmentBinding
import com.udacity.shoestore.models.shoeListViewModel
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.udacity.shoestore.models.Shoe

class shoeListFragment :Fragment() {


    private val viewModel : shoeListViewModel by activityViewModels()
    
    private lateinit var binding : ShoeListFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            binding  = DataBindingUtil.inflate(inflater,
            R.layout.shoe_list_fragment,
            container,false)

            viewModel.shoeList.observe(viewLifecycleOwner, Observer {list ->
               addShoe(list)
       })

        binding.floatingActionButton.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(shoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
        }
        setHasOptionsMenu(true)
        binding.lifecycleOwner=this
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())
                ||super.onOptionsItemSelected(item)

    }
    private fun addShoe(shoes:List<Shoe>){
        shoes.forEach{shoe ->
            val shoeDetailLayout = shoeDetailLayout(context)
            shoeDetailLayout.updateShoe(shoe)
            binding.shoeList.addView(shoeDetailLayout)
        }
    }
}
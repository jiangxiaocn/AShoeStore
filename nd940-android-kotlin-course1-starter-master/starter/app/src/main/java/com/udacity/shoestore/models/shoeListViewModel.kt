package com.udacity.shoestore.models


import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.databinding.ShoeDetailsFragmentBinding
import com.udacity.shoestore.screens.shoeDetailLayout

class shoeListViewModel() :ViewModel(), Observable {
    private val propertyChangeRegistry = PropertyChangeRegistry()
    private val shoes = MutableLiveData<MutableList<Shoe>>(mutableListOf())
        private val _shoeList= MutableLiveData<List<Shoe>>()
        val shoeList:LiveData<List<Shoe>>
        get() = _shoeList

       init {
           _shoeList.value = mutableListOf()
       }

    fun addShoeItem(item:Shoe){
        _shoeList.value= listOf(item)
    }
    /*
    @Bindable
     how to do this part?
     */

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

}


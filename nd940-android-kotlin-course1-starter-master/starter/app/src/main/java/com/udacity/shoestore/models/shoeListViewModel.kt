package com.udacity.shoestore.models

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.screens.shoeDetailLayout

class shoeListViewModel :ViewModel() {
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
     how to do this part?*/
}


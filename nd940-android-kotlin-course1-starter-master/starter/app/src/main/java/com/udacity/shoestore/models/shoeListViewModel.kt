package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class shoeListViewModel :ViewModel() {
        private val _shoeList= MutableLiveData<Shoe>()
        val shoeList:LiveData<Shoe>
        get() = _shoeList

        fun displayShoes(shoe: Shoe){

        }


}
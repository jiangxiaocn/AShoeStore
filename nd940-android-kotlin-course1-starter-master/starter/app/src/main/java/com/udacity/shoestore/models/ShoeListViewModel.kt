package com.udacity.shoestore.models


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListViewModel : ViewModel(){

    private var _newShoe = MutableLiveData<Shoe>()
    val newShoe: LiveData<Shoe>
        get() = _newShoe

        private val _shoeList= MutableLiveData<List<Shoe>>()
        val shoeList:LiveData<List<Shoe>>
        get() = _shoeList

    init {
        _shoeList.value = mutableListOf()
    }

        fun addShoeToList(newShoe: LiveData<Shoe>){

        }

}





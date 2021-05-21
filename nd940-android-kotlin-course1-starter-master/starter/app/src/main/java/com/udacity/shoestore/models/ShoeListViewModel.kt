package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.shoe_item_fragment.view.*


class ShoeListViewModel : ViewModel() {

    private var _newShoe = MutableLiveData<Shoe>()
    val newShoe: LiveData<Shoe>
        get() = _newShoe

        private val _shoeList= MutableLiveData<MutableList<Shoe>>()
        val shoeList:LiveData<MutableList<Shoe>>
            get() = _shoeList

    init {
        _shoeList.value = mutableListOf()
        _newShoe = MutableLiveData(Shoe("", 0.0, "", "", null))
    }

    fun addShoeToList(newShoe: Shoe){
           _shoeList.value!!.add(newShoe)
          _newShoe = MutableLiveData(Shoe("", 0.0, "", "", null))
        }

}





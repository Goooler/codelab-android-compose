package com.google.samples.apps.sunflower.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.samples.apps.sunflower.adapters.MY_GARDEN_PAGE_INDEX

class HomeViewPagerViewModel : ViewModel() {

    private val _currentItemIndex = MutableLiveData(MY_GARDEN_PAGE_INDEX)
    val currentItemIndex: LiveData<Int> = _currentItemIndex

    fun setCurrentItemIndex(index: Int) {
        _currentItemIndex.value = index
    }
}
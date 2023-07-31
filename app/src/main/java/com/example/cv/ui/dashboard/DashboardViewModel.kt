package com.example.cv.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Instituto Tecnologico Superior De Misantla"
    }
    val text: LiveData<String> = _text
}
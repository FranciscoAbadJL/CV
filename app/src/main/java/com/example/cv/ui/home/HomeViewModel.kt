package com.example.cv.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Estudiante de ingeniería en\n" +
                "sistemas computacionales.\n" +
                "Me considero una persona\n" +
                "comprometida y enfocada\n" +
                "en todo lo que hace.\n" +
                "Cuento con facilidad para\n" +
                "hablar y expresarme.\n" +
                "Busco en donde realizar\n" +
                "mis practicas profesionales."
    }
    val text: LiveData<String> = _text
}
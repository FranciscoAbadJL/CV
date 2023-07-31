package com.example.cv.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "- Desarrollo de software y aplicaciones móviles\n" +
                "- Conocimientos en redes de computadoras\n" +
                "- Manejo y uso de maquinas virtuales\n" +
                "- Administración y manipulación de bases de datos\n" +
                "- Mantenimiento de software y hardware\n" +
                "- Uso y control de SO basados en linux\n" +
                "- Manejo de XML"
    }
    val text: LiveData<String> = _text
}
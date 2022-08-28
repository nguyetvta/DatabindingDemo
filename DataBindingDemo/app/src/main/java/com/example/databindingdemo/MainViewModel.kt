package com.example.databindingdemo

import android.app.Application
import android.text.Editable
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val edtValue = MutableLiveData("Hello")

    fun onTextChanged(value: Editable) {
        Log.d("TAG", "onTextChanged() called with: value = $value")
        edtValue.value = value.toString()
    }


}
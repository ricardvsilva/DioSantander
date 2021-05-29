package com.rick.dioandroidsantander.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rick.dioandroidsantander.data.Conta
import com.rick.dioandroidsantander.local.FakeData

class MainViewModel:ViewModel() {

    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente():LiveData<Conta>{
        mutableLiveData.value = FakeData().getLocalData()
        return mutableLiveData
    }

}
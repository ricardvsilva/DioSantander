package com.rick.dioandroidsantander.local

import com.rick.dioandroidsantander.data.Cartao
import com.rick.dioandroidsantander.data.Cliente
import com.rick.dioandroidsantander.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Camila")
        val cartao = Cartao("5525")
        return Conta(
            "445655-4",
            "6552-4",
            "2450,80",
            "4120,00",
            cliente,
            cartao
        )
    }
}
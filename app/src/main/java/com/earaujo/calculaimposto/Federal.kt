package com.earaujo.calculaimposto

class Federal : Imposto {
    override fun calculaImposto(valorDoProduto: Double): Double {
        return valorDoProduto*0.01
    }
}
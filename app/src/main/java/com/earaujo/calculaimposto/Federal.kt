package com.earaujo.calculaimposto

class Federal : Imposto {
    override fun calculaImposto(valorDoProduto: Double): Double {
        if (valorDoProduto < 1000f) {
            return valorDoProduto*0.1
        } else {
            return valorDoProduto*0.05
        }
    }
}
package com.earaujo.calculaimposto

class Municipal : Imposto {
    override fun calculaImposto(valorDoProduto: Double): Double {
        if (valorDoProduto < 500f) {
            return valorDoProduto*0.5
        } else {
            return valorDoProduto*0.25
        }
    }
}
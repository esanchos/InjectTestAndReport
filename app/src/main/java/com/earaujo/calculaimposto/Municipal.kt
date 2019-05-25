package com.earaujo.calculaimposto

class Municipal : Imposto {
    override fun calculaImposto(valorDoProduto: Double): Double {
        return valorDoProduto * 0.012
    }
}
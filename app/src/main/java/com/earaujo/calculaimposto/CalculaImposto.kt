package com.earaujo.calculaimposto

open class CalculaImposto(private val calculaFederal: Federal, private val calculaMunicipal: Municipal) {

    open fun calcular(valor: Double): Double {
        val impostoFederal = calculaFederal.calculaImposto(valor)
        val impostoMunicipal = calculaMunicipal.calculaImposto(valor)

        return valor + impostoFederal + impostoMunicipal
    }
}
package com.earaujo.calculaimposto.util

import com.earaujo.calculaimposto.App
import com.earaujo.calculaimposto.CalculaImposto

class TestApp : App() {

    lateinit var calculaImpostoTest: CalculaImposto

    override fun getCalculaImposto(): CalculaImposto {
        return calculaImpostoTest
    }
}
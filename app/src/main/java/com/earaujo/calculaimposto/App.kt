package com.earaujo.calculaimposto

import android.app.Application

class App: Application() {

    private lateinit var calculaImposto: CalculaImposto

    override fun onCreate() {
        super.onCreate()
        calculaImposto = CalculaImposto(Federal(), Municipal())
    }

    fun getCalculaImposto() = calculaImposto
}
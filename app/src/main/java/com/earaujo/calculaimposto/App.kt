package com.earaujo.calculaimposto

import android.app.Application

open class App: Application() {

    private lateinit var calculaImposto: CalculaImposto

    override fun onCreate() {
        super.onCreate()
        calculaImposto = CalculaImposto(Federal(), Municipal())
    }

    open fun getCalculaImposto() = CalculaImposto(Federal(), Municipal())
}
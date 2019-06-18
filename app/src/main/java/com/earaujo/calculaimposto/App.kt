package com.earaujo.calculaimposto

import android.app.Application

open class App: Application() {

    open fun getCalculaImposto() = CalculaImposto(Federal(), Municipal())
}
package com.earaujo.calculaimposto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val calculaImpostoBR = CalculaImposto(Federal(), Municipal())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcula.setOnClickListener {
            val valorDaCompra = et_compra.text.toString().toDouble()
            val imposto = calculaImpostoBR.calcular(valorDaCompra)
            tv_imposto.text = imposto.toString()
        }
    }
}

package com.earaujo.calculaimposto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var calculaImpostoBR: CalculaImposto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculaImpostoBR  = (application as App).getCalculaImposto()

        btn_calcula.setOnClickListener {
            val valorDaCompra = et_compra.text.toString().toDouble()
            val imposto = calculaImpostoBR.calcular(valorDaCompra)
            tv_imposto.text = imposto.toString()
        }
    }
}

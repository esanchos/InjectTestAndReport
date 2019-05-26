package com.earaujo.calculaimposto

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculaImpostoTest {

    lateinit var calculaImposto: CalculaImposto

    @Before
    fun setup() {
        calculaImposto = CalculaImposto()
    }

    @Test
    fun `When calculating final price, result should be the sum of purchase, federal and municipal taxes`() {
        //Prepare
        val productValue = 500.0

        //Action
        val result = calculaImposto.calcular(productValue)

        //Check
        assertEquals(result, 675.0, 0.001)
    }
}

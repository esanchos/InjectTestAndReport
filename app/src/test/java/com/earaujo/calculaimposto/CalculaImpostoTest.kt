package com.earaujo.calculaimposto

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculaImpostoTest {

    lateinit var federal: Federal
    lateinit var municipal: Municipal

    lateinit var calculaImposto: CalculaImposto

    @Before
    fun setup() {
        federal = Mockito.mock(Federal::class.java)
        municipal = Mockito.mock(Municipal::class.java)

        calculaImposto = CalculaImposto(federal, municipal)
    }

    @Test
    fun `When calculating final price, result should be the sum of purchase, federal and municipal taxes`() {
        //Prepare
        val productValue = 1000.0
        `when`(federal.calculaImposto(productValue)).thenReturn(100.0)
        `when`(municipal.calculaImposto(productValue)).thenReturn(200.0)

        //Action
        val result = calculaImposto.calcular(productValue)

        //Check
        verify(federal, Mockito.times(1)).calculaImposto(productValue)
        verify(municipal, Mockito.times(1)).calculaImposto(productValue)
        assertEquals(result, 1300.0, 0.001)
    }
}

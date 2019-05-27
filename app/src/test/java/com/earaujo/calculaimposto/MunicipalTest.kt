package com.earaujo.calculaimposto

import org.junit.Assert.assertEquals
import org.junit.Test

class MunicipalTest {

    @Test
    fun `When purchase is below 500, tax should be 50%`() {
        //Prepare
        val municipal = Municipal()

        //Action
        val result = municipal.calculaImposto(499.0)

        //Check
        assertEquals(result, 249.5, 0.0001)
    }

    @Test
    fun `When purchase is 500, tax should be 25%`() {
        //Prepare
        val municipal = Municipal()

        //Action
        val result = municipal.calculaImposto(500.0)

        //Check
        assertEquals(result, 125.0, 0.0001)
    }

    @Test
    fun `When purchase is greater than 500, tax should be 25%`() {
        //Prepare
        val municipal = Municipal()

        //Action
        val result = municipal.calculaImposto(501.0)

        //Check
        assertEquals(result, 125.25, 0.0001)
    }
}
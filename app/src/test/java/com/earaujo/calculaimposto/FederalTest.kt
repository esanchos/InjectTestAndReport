package com.earaujo.calculaimposto

import org.junit.Assert
import org.junit.Test

class FederalTest {

    @Test
    fun `When purchase is below 1000, tax should be 10%`() {
        //Prepare
        val federal = Federal()

        //Action
        val result = federal.calculaImposto(999.0)

        //Check
        Assert.assertEquals(result, 99.9, 0.0001)
    }

    @Test
    fun `When purchase is 1000, tax should be 5%`() {
        //Prepare
        val federal = Federal()

        //Action
        val result = federal.calculaImposto(1000.0)

        //Check
        Assert.assertEquals(result, 50.0, 0.0001)
    }

    @Test
    fun `When purchase is greater than 1000, tax should be 5%`() {
        //Prepare
        val federal = Federal()

        //Action
        val result = federal.calculaImposto(1001.0)

        //Check
        Assert.assertEquals(result, 50.05, 0.0001)
    }
}
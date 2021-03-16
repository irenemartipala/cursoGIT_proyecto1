package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LibreriaMultiplicarTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void multiplicar5y8()
    {
        assertTrue( 40==Libreria.multiplicar(5,8) );
    }
    @Test
    public void multiplicar5y0()
    {
        assertTrue( 0==Libreria.multiplicar(5,0) );
    }
    @Test
    public void multiplicar5yMenos3()
    {
        assertTrue( -15==Libreria.multiplicar(5,-3) );
    }
    @Test
    public void multiplicarr3y5()
    {
        assertTrue( 15==Libreria.multiplicar(3,5) );
    }
}

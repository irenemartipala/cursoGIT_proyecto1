package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LibreriaTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void suma5y8()
    {
        assertTrue( 13==Libreria.suma(5,8) );
    }
    @Test
    public void suma5y0()
    {
        assertTrue( 5==Libreria.suma(5,0) );
    }
    @Test
    public void suma5yMenos3()
    {
        assertTrue( 2==Libreria.suma(5,-3) );
    }
    @Test
    public void resta3y5()
    {
        assertTrue( -2==Libreria.resta(3,5) );
    }
}

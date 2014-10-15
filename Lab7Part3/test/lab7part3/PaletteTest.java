/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7part3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexander.louck418
 */
public class PaletteTest {
    
    public PaletteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWeight method, of class Palette.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Palette instance = new Palette(10,10);
        double expResult = 96.0;
        double result = instance.getWeight();
        //System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Palette.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Palette instance = new Palette(10,10);
        double expResult = 23.0;
        double result = instance.getHeight();
        //System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

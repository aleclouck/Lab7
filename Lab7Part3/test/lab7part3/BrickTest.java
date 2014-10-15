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
public class BrickTest {
    
    public BrickTest() {
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
     * Test of getSurfaceArea method, of class Brick.
     */
    @Test
    public void testGetSurfaceArea() {
        System.out.println("getSurfaceArea");
        Brick instance = new Brick(8, 20, 12);
        double expResult = 832.0;
        double result = instance.getSurfaceArea();
        //System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Brick.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Brick instance = new Brick(8, 20, 12);
        double expResult = 0.96;
        double result = instance.getWeight();
        //System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Brick.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Brick instance = new Brick(8, 20, 12);
        double expResult = 1920.0;
        double result = instance.getVolume();
        //System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Brick.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Brick instance = new Brick(8, 20, 12);
        double expResult = 8.0;
        double result = instance.getHeight();
        //System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

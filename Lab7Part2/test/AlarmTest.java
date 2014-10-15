/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class AlarmTest {
    
    public AlarmTest() {
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
     * Test of getHour method, of class Alarm.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Alarm instance = new Alarm();
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Alarm.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Alarm instance = new Alarm();
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class Alarm.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int hr = 7;
        int min = 30;
        Alarm instance = new Alarm();
        boolean expResult = true;
        boolean result = instance.setTime(hr, min);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alarm.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alarm instance = new Alarm();
        instance.setTime(7, 30);
        String expResult = "7:30AM";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

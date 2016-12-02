/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayHandling;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thilini.Samaranayake
 */
public class arrayItemHandlingTest {
    
    public arrayItemHandlingTest() {
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
     * Test of getIntialResultList method, of class arrayItemHandling.
     */
   

    /**
     * Test of splitArray method, of class arrayItemHandling.
     */
    @Test
    public void testSplitArray() {
        System.out.println("splitArray");
        String Item = "(galadari-123-1222),(galadari-123-1222),(galadari-123-1222)";
        arrayItemHandling instance = new arrayItemHandling();
        instance.splitArray(Item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}

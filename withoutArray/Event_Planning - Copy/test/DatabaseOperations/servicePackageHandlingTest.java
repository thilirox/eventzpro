/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperations;

import java.sql.ResultSet;
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
public class servicePackageHandlingTest {
    
    public servicePackageHandlingTest() {
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
     * Test of selectPackage method, of class servicePackageHandling.
     */
    @Test
    public void testSelectPackage() {
        System.out.println("selectPackage");
        String service = "HotelGaladari";
        String pname = "PackageGOLD";
        servicePackageHandling instance = new servicePackageHandling();
        ResultSet expResult = null;
        ResultSet result = instance.selectPackage(service, pname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of selectPackageDetails method, of class servicePackageHandling.
     */
    @Test
    public void testSelectPackageDetails() {
        System.out.println("selectPackageDetails");
        String service = "HotelGaladari";
        String pname = "PackageGOLD";
        servicePackageHandling instance = new servicePackageHandling();
       
        ResultSet result = instance.selectPackageDetails(service, pname);
         ResultSet expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveImages method, of class servicePackageHandling.
     */
    @Test
    public void testSaveImages() {
        System.out.println("SaveImages");
        String service = "";
        String ImageURI = "";
        servicePackageHandling instance = new servicePackageHandling();
        instance.SaveImages(service, ImageURI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetImages method, of class servicePackageHandling.
     */
    @Test
    public void testGetImages() {
        System.out.println("GetImages");
        String service = "";
        servicePackageHandling instance = new servicePackageHandling();
        ResultSet expResult = null;
        ResultSet result = instance.GetImages(service);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

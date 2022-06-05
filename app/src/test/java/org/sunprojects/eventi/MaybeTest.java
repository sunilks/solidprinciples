package org.sunprojects.eventi;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sunil
 */
public class MaybeTest {
    
    public MaybeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isPresent method, of class Maybe.
     */
    //@Test
    public void testIsPresent() {
        System.out.println("isPresent");
        Maybe instance = new Maybe();
        boolean expResult = false;
        boolean result = instance.isPresent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Maybe.
     */
    //@Test
    public void testGetValue() throws Exception {
        System.out.println("getValue");
        Maybe instance = new Maybe();
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testInstantiateMaybeWithoutAnyValueInConstructor(){
        var v = new Maybe<String>();
        assertEquals(v.isPresent(), false);
        assertThrows(IllegalValueAccessException.class, v::getValue);
        try {
            assertEquals(v.getValue(), "This is a sample string!");
        } catch (Exception ex) {
            Logger.getLogger(MaybeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void testInstantiateMaybeWithValueInConstructor(){
        var v = new Maybe<String>("This is a sample string!");
        try {
            assertEquals(v.getValue(), "This is a sample string!");
        } catch (Exception ex) {
            Logger.getLogger(MaybeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

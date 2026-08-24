/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.medicareassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ReportsTest {
    
    public ReportsTest() {
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
     * Test of showPatients method, of class Reports.
     */
    @Test
    public void testShowPatients() {
        System.out.println("showPatients");
        PatientManagement[] patients = null;
        int totalPatients = 0;
        Reports instance = new Reports();
        instance.showPatients(patients, totalPatients);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showAvailableBeds method, of class Reports.
     */
    @Test
    public void testShowAvailableBeds() {
        System.out.println("showAvailableBeds");
        BedManagement[] beds = null;
        Reports instance = new Reports();
        instance.showAvailableBeds(beds);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showOccupiedBeds method, of class Reports.
     */
    @Test
    public void testShowOccupiedBeds() {
        System.out.println("showOccupiedBeds");
        BedManagement[] beds = null;
        Reports instance = new Reports();
        instance.showOccupiedBeds(beds);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of showTotalOccupied method, of class Reports.
     */
    @Test
    public void testShowTotalOccupied() {
        System.out.println("showTotalOccupied");
        BedManagement[] beds = null;
        Reports instance = new Reports();
        instance.showTotalOccupied(beds);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showOccupancy method, of class Reports.
     */
    @Test
    public void testShowOccupancy() {
        System.out.println("showOccupancy");
        BedManagement[] beds = null;
        Reports instance = new Reports();
        instance.showOccupancy(beds);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

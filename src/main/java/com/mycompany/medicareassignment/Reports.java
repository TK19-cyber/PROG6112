/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicareassignment;

/**
 *
 * @author Student
 */
public class Reports {

    public void showPatients(PatientManagement[] patients, int totalPatients) {

        System.out.println("Registered Patients:");

        for (int i = 0; i < totalPatients; i++) {
            System.out.println(patients[i].patientID + " "
                    + patients[i].firstName + " "
                    + patients[i].lastName);
        }

        System.out.println("Total Patients: " + totalPatients);
    }

    public void showAvailableBeds(BedManagement[] beds) {

        System.out.println("Available Beds:");

        for (int i = 0; i < 20; i++) {
            if (!beds[i].occupied) {
                System.out.println(beds[i].bedID);
            }
        }
    }

    public void showOccupiedBeds(BedManagement[] beds) {

        System.out.println("Occupied Beds:");

        for (int i = 0; i < 20; i++) {
            if (beds[i].occupied) {
                System.out.println(beds[i].bedID);
            }
        }
    }

    public void showTotalOccupied(BedManagement[] beds) {

        int total = 0;

        for (int i = 0; i < 20; i++) {
            if (beds[i].occupied) {
                total++;
            }
        }

        System.out.println("Total Occupied Beds: " + total);
    }

    public void showOccupancy(BedManagement[] beds) {

        int total = 0;

        for (int i = 0; i < 20; i++) {
            if (beds[i].occupied) {
                total++;
            }
        }

        double percentage = (total / 20.0) * 100;

        System.out.println("Ward Occupancy: " + percentage + "%");
    }
}
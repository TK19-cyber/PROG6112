/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicareassignment;

/**
 *
 * @author Student
 */
public class Inpatient extends PatientManagement {

    String wardNumber;
    String bedNumber;

    public Inpatient(String patientID, String firstName, String lastName,
                     int age, String gender, String medicalCondition,
                     String wardNumber, String bedNumber) {

        super(patientID, firstName, lastName, age, gender,
              medicalCondition, PatientCategory.INPATIENT);

        this.wardNumber = wardNumber;
        this.bedNumber = bedNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Ward Number: " + wardNumber);
        System.out.println("Bed Number: " + bedNumber);
    }
}
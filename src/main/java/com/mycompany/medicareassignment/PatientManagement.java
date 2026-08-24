/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicareassignment;

/**
 *
 * @author Student
 */
public class PatientManagement {

    String patientID;
    String firstName;
    String lastName;
    int age;
    String gender;
    String medicalCondition;
    PatientCategory category;

    public PatientManagement(String patientID, String firstName, String lastName,
                   int age, String gender, String medicalCondition,
                   PatientCategory category) {

        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.medicalCondition = medicalCondition;
        this.category = category;
    }

    public void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Condition: " + medicalCondition);
        System.out.println("Category: " + category);
    }
}
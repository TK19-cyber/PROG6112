/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medicareassignment;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MedicareAssignment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PatientManagement[] patients = new PatientManagement[20];
        BedManagement[] beds = new BedManagement[20];

        for (int i = 0; i < 20; i++) {
            beds[i] = new BedManagement("B" + (i + 1));
        }

        int totalPatients = 0;
        int choice;

        do {
            System.out.println("\n===== MEDICARE HOSPITAL =====");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Display Beds");
            System.out.println("4. Reports");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("Patient ID: ");
                String id = input.nextLine();

                System.out.print("First Name: ");
                String firstName = input.nextLine();

                System.out.print("Last Name: ");
                String lastName = input.nextLine();

                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine();

                System.out.print("Gender: ");
                String gender = input.nextLine();

                System.out.print("Medical Condition: ");
                String condition = input.nextLine();

                System.out.print("Category: ");
                PatientCategory category =
                        PatientCategory.valueOf(input.nextLine().toUpperCase());

                patients[totalPatients] = new PatientManagement(
                        id, firstName, lastName, age,
                        gender, condition, category
                );

                totalPatients++;

                System.out.println("Patient registered.");

            } else if (choice == 2) {

                for (int i = 0; i < totalPatients; i++) {
                    patients[i].displayDetails();
                    System.out.println();
                }

            } else if (choice == 3) {

                for (int i = 0; i < 20; i++) {

                    System.out.print(beds[i].bedID + " ");

                    if ((i + 1) % 5 == 0) {
                        System.out.println();
                    }
                }

            } else if (choice == 4) {

                Reports reports = new Reports();

                reports.showPatients(patients, totalPatients);
                reports.showAvailableBeds(beds);
                reports.showOccupiedBeds(beds);
                reports.showTotalOccupied(beds);
                reports.showOccupancy(beds);
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}
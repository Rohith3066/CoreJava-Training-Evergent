package com.evergent.corejava.finalproject;

import java.util.Scanner;

public class BloodDonationController {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int donorId = 0;
        String donorName = "";
        long mobileNumber = 0;
        String bloodType = "";
        int ch, ch1 = 1;
        
        BloodDonationService bloodService = new BloodDonationService();

        System.out.println("--------------------- WELCOME TO BLOOD DONATION SYSTEM ---------------------");
        while (ch1 != 0) {
            System.out.println("1. Register a New Donor");
            System.out.println("2. View Donor Information");
            System.out.println("3. Donate Blood");
            System.out.println("4. View Donation History");
            System.out.println("5. List Available Donors");
            System.out.println("Enter your choice :");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Donor ID:");
                    donorId = s.nextInt();
                    System.out.println("Enter Donor Name:");
                    donorName = s.next();
                    System.out.println("Enter Mobile Number:");
                    mobileNumber = s.nextLong();
                    System.out.println("Enter Blood Type:");
                    bloodType = s.next();
                    int result = bloodService.registerDonor(donorId, donorName, mobileNumber, bloodType);
                    System.out.println(result + " Donor Registered Successfully");
                    break;
                case 2:
                    System.out.println("Enter Donor ID:");
                    donorId = s.nextInt();
                    String donorInfo = bloodService.viewDonorInfo(donorId);
                    System.out.println(donorInfo);
                    break;
                case 3:
                    System.out.println("Enter Donor ID:");
                    donorId = s.nextInt();
                    int donationResult = bloodService.donateBlood(donorId);
                    System.out.println(donationResult + " Donation Recorded Successfully");
                    break;
                case 4:
                    System.out.println("Enter Donor ID:");
                    donorId = s.nextInt();
                    String donationHistory = bloodService.viewDonationHistory(donorId);
                    System.out.println(donationHistory);
                    break;
                case 5:
                    System.out.println("Available Donors:");
                    String availableDonors = bloodService.listAvailableDonors();
                    System.out.println(availableDonors);
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
            System.out.println("\nEnter 1 to perform More Operations and 0 for Exit :");
            ch1 = s.nextInt();
        }
    }
}


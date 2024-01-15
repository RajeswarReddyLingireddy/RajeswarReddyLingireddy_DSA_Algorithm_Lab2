package com.gl.lab2.ass1.transaction;

import java.util.Scanner;

public class TransactionTarget {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter number of days shop was open ");
        int noOfDays = scanner.nextInt();

        int[] revenue = new int[noOfDays];
        System.out.println("Please enter the collection for each day ");
        for (int i = 0; i < noOfDays; i++) {
            revenue[i] = scanner.nextInt();
        }
        System.out.println("Please enter number of targets");
        int targets = scanner.nextInt();
        for (int i = 0; i < targets; i++) {
            System.out.println("Please enter value of target");
            int target = scanner.nextInt();
            targetAchieved(revenue, target);

        }
        scanner.close();


    }

    private static void targetAchieved(int[] revenue, int target) {
        int sum = 0;
        int noOfDays = revenue.length;
        int j;
        for (j = 0; j < noOfDays; j++) {
            sum = sum + revenue[j];
            if (sum >= target) {
                System.out.println("Target " + target + " achieved on " + (j + 1) + " day");
                break;
            }
        }

        if (j == noOfDays)
            System.out.println("Target " + target + " not achieved");
    }
}

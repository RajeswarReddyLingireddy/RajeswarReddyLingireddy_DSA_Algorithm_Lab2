package com.gl.lab2.ass2.currency;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCurrencyNoteCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of currency notes available in your country ");
        int noOfCurrencyNotes = scanner.nextInt();
        int[] currencyNotes = new int[noOfCurrencyNotes];
        System.out.println("Please enter the note denominations ");
        for (int i = 0; i < noOfCurrencyNotes; i++) {
            currencyNotes[i] = scanner.nextInt();
        }
        //System.out.println("Before sorting : " + Arrays.toString(currencyNotes));
        Arrays.sort(currencyNotes);
        //System.out.println("After sorting : " + Arrays.toString(currencyNotes));
        System.out.println("Enter amount you wish to exchange ");
        int amount = scanner.nextInt();
        CurrencyNoteExchange.getNotes(currencyNotes, amount);
    }
}

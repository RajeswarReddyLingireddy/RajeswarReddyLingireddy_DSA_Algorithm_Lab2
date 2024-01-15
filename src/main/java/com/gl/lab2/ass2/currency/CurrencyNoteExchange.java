package com.gl.lab2.ass2.currency;

public class CurrencyNoteExchange {
    public static void getNotes(int[] currencyNotes, int amount) {
        int[] notes = new int[currencyNotes.length];
        int actualAmount = amount;
        int sum = 0;
        for (int i = currencyNotes.length - 1, j = 0; i >= 0 && j < notes.length; i--, j++) {
            notes[j] = amount / currencyNotes[i];
            amount = amount % currencyNotes[i];
            sum += notes[j];

        }
        System.out.println("Your payment approach in order to give min no of notes will be  ");
        for (int i = currencyNotes.length - 1, j = 0; i >= 0 && j < notes.length; i--, j++) {
            if(notes[j]>0){
            System.out.println( currencyNotes[i] + " : " + notes[j]);
            }
        }

    }
}

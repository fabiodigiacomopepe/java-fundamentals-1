package org.lessons.java.fundamentals;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo all'utente i km da percorrere e l'età
        System.out.print("Inserisci i km da percorrere: ");
        String kmTicket = scan.nextLine();
        double kmTicketDouble = Double.parseDouble(kmTicket);   // Trasformo da stringa a decimale
        System.out.print("Inserisci la tua età: ");
        String userAge = scan.nextLine();
        int userAgeInt = Integer.parseInt(userAge);             // Trasformo da stringa a intero

        // Fisso prezzo al km
        double euroKm = 0.21;

        // Calcolo prezzo finale
        double calcPrice = kmTicketDouble * euroKm;

        if (userAgeInt < 18) { // Sconto minorenni
            double finalPrice = calcPrice - (calcPrice * 0.20);
            System.out.println("Prezzo scontato 20% (poichè minorenne) = " + finalPrice + "€");
        } else if (userAgeInt > 65) { // Sconto over 65
            double finalPrice = calcPrice - (calcPrice * 0.40);
            System.out.println("Prezzo scontato 40% (poichè over 65) = " + finalPrice + "€");
        } else { // Prezzo pieno
            System.out.println("Prezzo senza sconto (poichè tra 18-65 anni) = " + calcPrice + "€");
        }

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}

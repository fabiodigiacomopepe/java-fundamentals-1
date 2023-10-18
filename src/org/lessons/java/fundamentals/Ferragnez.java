package org.lessons.java.fundamentals;

import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {
        // Creo e inizializzo array con nome e cognome degli invitati
        String[] attendees = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo all'utente il proprio nome e cognome
        System.out.print("Inserisci il tuo nome e cognome: ");
        String yourNameSurname = scan.nextLine();

        // Inizializzo una variabile booleana che tiene traccia se il nome/cognome è tra la lista partecipanti
        boolean found = false;

        for (int i = 0; i < attendees.length; i++) {
            if (yourNameSurname.equals(attendees[i])) {
                // se il valore alla posizione corrente è uguale al nome/cognome dell'utente cambio il valore di found
                found = true;
                break;
            }
        }

        // Se found è true
        if (found) {
            System.out.println("Benvenuto, puoi entrare!");
        } // Altrimenti (quindi se è false)
        else {
            System.out.println("Mi dispiace, ma non sei sulla lista.");
        }

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}

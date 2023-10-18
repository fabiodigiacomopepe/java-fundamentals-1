package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo nome
        System.out.print("Inserisci il tuo nome: ");
        String userNameDirt = scan.nextLine();
        // Rimuovo eventuali spazi da nome
        String userName = userNameDirt.replaceAll("\\s+", "");

        // Chiedo cognome
        System.out.print("Inserisci il tuo cognome: ");
        String userSurnameDirt = scan.nextLine();
        // Rimuovo eventuali spazi da cognome
        String userSurname = userSurnameDirt.replaceAll("\\s+", "");

        // Chiedo colore preferito
        System.out.print("Inserisci il tuo colore preferito: ");
        String userColor = scan.nextLine();

        // Chiedo giorno nascita
        System.out.print("Inserisci il giorno (numero) in cui sei nato: ");
        String userBirthDayString = scan.nextLine();
        int userBirthDay = Integer.parseInt(userBirthDayString);

        // Chiedo mese nascita
        System.out.print("Inserisci il mese (numero) in cui sei nato: ");
        String userBirthMonthString = scan.nextLine();
        int userBirthMonth = Integer.parseInt(userBirthMonthString);

        // Chiedo anno nascita
        System.out.print("Inserisci l'anno (numero) in cui sei nato: ");
        String userBirthYearString = scan.nextLine();
        int userBirthYear = Integer.parseInt(userBirthYearString);

        // Calcolo e stampo somma giorno/mese/anno nascita
        int sommaTotale = userBirthDay + userBirthMonth + userBirthYear;
        System.out.println("Somma totale = " + sommaTotale);

        // Creo e stampo password
        System.out.println("La tua password è: " + userName + "-" + userSurname + "-" + userColor + "-" + sommaTotale);

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
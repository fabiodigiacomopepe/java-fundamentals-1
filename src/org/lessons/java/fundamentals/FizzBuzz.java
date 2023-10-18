package org.lessons.java.fundamentals;

public class FizzBuzz {
    public static void main(String[] args) {
        // Itero 100 volte
        for (int i = 1; i <= 100 ; i++) {
            // Se i è multiplo di 3 e di 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");     // Stampo FizzBuzz
            } // Se i è multiplo di 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");         // Stampo Fizz
            } // Se i è multiplo di 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");         // Stampo Buzz
            } // Se i non è multiplo nè di 3, nè di 5, nè di 3 e 5 assieme
            else {
                System.out.println(i);              // Stampo iĺ valore di i
            }
        }
    }
}

package com.newjavaproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjscie");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> System.out.println("wybrano 1");
                case 2 -> System.out.println("wybrano 2");
                case 3 -> System.out.println("wybrano 3");
                case 4 -> System.out.println("wybrano 4");
                case 5 -> shouldContinue = false;


/*            Przed wersją Java 12, metoda switch działała inaczej, przykład:
            switch (userChoice) {
                case 1:
                    System.out.println("wybrano 1");
                    break;
                case 2:
                    System.out.println("wybrano 2");
                    break;
                case 3:
                    System.out.println("wybrano 3");
                    break;
                case 4:
                    System.out.println("wybrano 4");
                    break;
                case 5:
                    shouldContinue = false;
                    break;

 */
            }
        }
    }
}
package com.newjavaproject;

import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer,Guest> phonetoGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest (){
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy osoba jest Veganinem? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phonetoGuest.put(phoneNumber,guest);
        guests.add(guest);
    }

    public void displayMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber(){
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phonetoGuest.get(phoneNumber);

        guest.displayGuestInformation();
    }

    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInformation();
            System.out.println();

        }
    }
}

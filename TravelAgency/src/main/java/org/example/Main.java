package org.example;

public class Main {
    public static void main(String[] args) {
        Passengers passengers = new Passengers();
        System.out.println("welcome to our app" + passengers.getName());
        Destinations destinations = new Destinations();
        System.out.println("You are visiting" + destinations.destinatioName);

        TravelPackage travelPackage = new TravelPackage();

    }
}
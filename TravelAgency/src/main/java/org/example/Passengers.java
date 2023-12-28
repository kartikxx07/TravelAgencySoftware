package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Passengers {
    private String name;
    private String subtype;
    private int balance;
    private int passengerNumber;
    public List<String> activitiesenrolled = new ArrayList<>();

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'subtype'
    public String getSubtype() {
        return subtype;
    }

    // Setter for 'subtype'
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    // Getter for 'balance'
    public int getBalance() {
        return balance;
    }

    // Setter for 'balance'
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter for 'passengerNumber'
    public int getPassengerNumber() {
        return passengerNumber;
    }

    // Setter for 'passengerNumber'
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void getPassengerDetails(String name, String subtype, int balance, int passengerNumber){
        this.name = name;
        this.subtype = subtype;
        this.balance = balance;
        this.passengerNumber = passengerNumber;
        System.out.println("Name:" + name +"Subtype:" +subtype +
                "Balance:" + balance + "Passenger Number:" + passengerNumber);
    }
   // public List<String> getActivitiesenrolled(List<String> activitiesenrolled){

    //}

}

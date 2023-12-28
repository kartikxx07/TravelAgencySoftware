package org.example;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    public String ActivityName;
    public int Activitycapacity;
    public int Activitycost;
    public String descriptionActivity;

    public boolean isEnrolled = false;
    public Activities(){

    }
    Passengers passengers = new Passengers();
    public List<String> activityRegistration = new ArrayList<>();
    public int maxCapacity = 100;

    public void addThePassengers() {
        String subtype = passengers.getSubtype();
        int balance = passengers.getBalance();

        if ("standard".equals(subtype)) {
            if (balance > Activitycost && activityRegistration.size() < maxCapacity) {
                activityRegistration.add(passengers.getName());
                isEnrolled = true;
                passengers.activitiesenrolled.add(ActivityName);
            }
        } else if ("premium".equals(subtype)) {
            if (activityRegistration.size() < maxCapacity) {
                activityRegistration.add(passengers.getName());
                isEnrolled = true;
                passengers.activitiesenrolled.add(ActivityName);
            }
        } else if ("gold".equals(subtype)) {
            if (balance > (Activitycost * 100) / 10 && activityRegistration.size() < maxCapacity) {
                activityRegistration.add(passengers.getName());
                isEnrolled = true;
                passengers.activitiesenrolled.add(ActivityName);
            }
        }
    }
    public void checkForSlots(List<String> activityRegistration) {
        int count = activityRegistration.size();
        for (String registration : activityRegistration) {
            if (registration != null) {
                count--;
            }
        }

        if (count == 0) {
            System.out.println("No spots left for this activity");
        } else if (count > 0) {
            System.out.println("Spots are filling fast for " + ActivityName + Activitycost + descriptionActivity);
        }
    }
}

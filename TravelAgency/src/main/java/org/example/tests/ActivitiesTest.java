package org.example.tests;

import org.example.Activities;
import org.example.Passengers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ActivitiesTest {
    @Test
    public void testAddThePassengers_Standard() {
        // Test for standard passenger
        Passengers passengers = new Passengers();
        passengers.setSubtype("standard");
        passengers.setBalance(200); // Assuming balance is sufficient
        passengers.setName("John");

        Activities activity = new Activities();
        activity.ActivityName = "Hiking";
        activity.Activitycost = 50; // Assuming cost of the activity
        activity.addThePassengers();

        assertTrue(activity.isEnrolled);
        assertEquals("John", activity.activityRegistration.get(0));
        assertEquals("Hiking", passengers.activitiesenrolled.get(0));
    }

    @Test
    public void testCheckForSlots_NoSlotsLeft() {
        // Test when there are no slots left for the activity
        Activities activity = new Activities();
        activity.ActivityName = "Concert";
        activity.activityRegistration.add("Alice");
        activity.activityRegistration.add("Bob");

        activity.checkForSlots(activity.activityRegistration);
        // Assuming the size of activityRegistration is equal to maxCapacity
        assertEquals("No spots left for this activity",
                outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCheckForSlots_SlotsAvailable() {
        // Test when there are slots available for the activity
        Activities activity = new Activities();
        activity.ActivityName = "Museum Visit";
        activity.Activitycost = 20; // Assuming cost of the activity
        activity.descriptionActivity = "Tour of historical museum";

        activity.activityRegistration.add("Alice");
        activity.activityRegistration.add(null); // One slot available

        activity.checkForSlots(activity.activityRegistration);
        // Assuming one slot is available
        assertEquals("Spots are filling fast for Museum Visit20Tour of historical museum",
                outputStreamCaptor.toString().trim());
    }
}

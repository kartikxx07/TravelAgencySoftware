package org.example.tests;

import org.example.Activities;
import org.example.Destinations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class DestinationsTest {

    @Test
    public void testAddAndGetActivitiesForDestination() {
        // Create an instance of the Destinations class
        Destinations destinations = new Destinations();

        // Add activities for a destination
        Activities activity1 = new Activities();
        activity1.ActivityName = "Sightseeing";
        destinations.addActivity("Paris", activity1);

        Activities activity2 = new Activities();
        activity2.ActivityName = "Hiking";
        destinations.addActivity("Switzerland", activity2);

        // Get activities for a destination
        List<String> activitiesForParis = destinations.getActivitiesForDestination("Paris");
        List<String> activitiesForSwitzerland = destinations.getActivitiesForDestination("Switzerland");

        // Check if activities are retrieved correctly
        assertEquals(1, activitiesForParis.size());
        assertEquals("Sightseeing", activitiesForParis.get(0));

        assertEquals(1, activitiesForSwitzerland.size());
        assertEquals("Hiking", activitiesForSwitzerland.get(0));
    }
}


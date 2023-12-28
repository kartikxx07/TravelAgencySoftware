package org.example.tests;

import org.example.Destinations;
import org.example.TravelPackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelPackageTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPrintItinerary() {
        TravelPackage travelPackage = new TravelPackage();
        Destinations destination1 = new Destinations();
        destination1.destinatioName = "Destination A";
        Destinations destination2 = new Destinations();
        destination2.destinatioName = "Destination B";

        travelPackage.destinations.add(destination1);
        travelPackage.destinations.add(destination2);

        travelPackage.printItinerary();
        assertEquals("Destinations:Destination A\nDestinations:Destination B", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPrintTheListOfActivities() {
        TravelPackage travelPackage = new TravelPackage();
        Destinations destination = new Destinations();
        destination.destinatioName = "Destination C";
        destination.activityDestination.put("Activity 1", "Description 1");
        destination.activityDestination.put("Activity 2", "Description 2");
        travelPackage.destinations.add(destination);

        travelPackage.printthelistofActivities();
        assertEquals("Activities:[Description 1, Description 2]", outputStreamCaptor.toString().trim());
    }
}

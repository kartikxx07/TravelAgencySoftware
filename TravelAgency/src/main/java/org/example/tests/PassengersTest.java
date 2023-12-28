package org.example.tests;

import org.example.Passengers;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengersTest {

    @Test
    public void testGetPassengerDetails() {
        // Create an instance of the Passengers class
        Passengers passenger = new Passengers();

        // Create a ByteArrayOutputStream to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Invoke the getPassengerDetails method
        passenger.getPassengerDetails("Alice", "standard", 300, 54321);

        // Get the printed output
        String printedOutput = outputStream.toString().trim();

        // Reset System.out to its original value
        System.setOut(System.out);

        // Verify if the printed output contains the expected details
        String expectedOutput = "Name:AliceSubtype:standardBalance:300Passenger Number:54321";
        assertEquals(expectedOutput, printedOutput);
    }
}

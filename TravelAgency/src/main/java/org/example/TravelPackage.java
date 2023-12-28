package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TravelPackage {
    String packageName;
    int capacity;
    public List<Destinations> destinations = new ArrayList<>();
    Destinations destinations1 = new Destinations();
    String nameofTheDestination = destinations1.destinatioName;
    public void printItinerary() {
        for (Destinations destinations1: destinations){
            System.out.println("Destinations:"+destinations1.destinatioName);
        }
    }
    public void printthelistofActivities(){
        if (destinations1.activityDestination.containsKey(nameofTheDestination)){
            System.out.println("Activities:"+destinations1.activityDestination.values().toString());
        }
    }
}

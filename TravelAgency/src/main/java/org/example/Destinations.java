package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Destinations {
    public String destinatioName;
    String destinationCost;
    String destinationCap;
    String destinationDescription;

    public Destinations(){

    }
    public HashMap<String,String> activityDestination = new HashMap<>();
    /*

    List<String> listofActivities = new Arraylist<>();
    for(int i=0; i<listofActivities.size(); i++){
    listofActivities.add(activities.ActivityName);
    }
    to print the list of activities in destinations
    List<destinations> destinations = new Arraylist<>();
    for(Destination destination:destinations){
    system.out.println(destination.destinationName);
    for(Activity activities: listofActivities){
    system.out.println(destination.listofActivities.get(i)
    }
    }
     */

    public void addActivity(String destinatioName, Activities activities){
        String nameoftheActivity = activities.ActivityName;
        activityDestination.put(destinatioName,nameoftheActivity);
    }
    public List<String> getActivitiesForDestination(String destinationName) {
        return Collections.singletonList(activityDestination.get(destinationName));
    }
}

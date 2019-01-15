package com.kodilla.good.patterns.chalenges.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightsList {

    public static List<Flight> getTheFlightsList() {
        List<Flight> theFlightsList = new ArrayList<>();
        theFlightsList.add(new Flight("Warsaw", "Modlin"));
        theFlightsList.add(new Flight("London", "Rzeszow"));
        theFlightsList.add(new Flight("Oslo", "Moscow"));
        theFlightsList.add(new Flight("Moscow", "Skierniewice"));
        theFlightsList.add(new Flight("London", "Beijing"));
        theFlightsList.add(new Flight("Krakow", "Delhi"));

        return new ArrayList<>(theFlightsList);
    }
}

package com.kodilla.good.patterns.chalenges.flights;

public class Application {
    public static void main(String[] args) {
        System.out.println(FlightSearcher.searchByDepartureAirport("Beijing"));
        System.out.println(FlightSearcher.searchByDepartureAirport("Oslo"));
        System.out.println(FlightSearcher.searchByDepartureAirport("Skierniewice"));
        System.out.println(FlightSearcher.searchForConnectingFlights("Warsaw", "London",
                "New York"));
        System.out.println(FlightSearcher.searchForConnectingFlights("Rzeszow", "London", "Skierniewice"));
    }
}

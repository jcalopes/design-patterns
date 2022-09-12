package org.facade;

import java.time.LocalDate;

public class VacationFacade {

    //We could put all this content within the main class and remove this class. However, we would expose lots of complexity to our
    //client unnecessarily so VacationFacade is a nice way to hide all this complexity. If you check the main method you realize this approach
    //makes much more clean. Moreover, VacationClient now is decoupled from Flight, Hotel and CarRental classes.
    public void book(LocalDate startDate, LocalDate endDate){
        Flight flight = new Flight();
        flight.bookOutwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);
    }
}


import java.util.HashMap;
import java.util.Map;

class ReservationManager {
    private Map flightAvailability;
    private Map hotelAvailability;

    public ReservationManager() {
        // Initialize flight and hotel availability data
        flightAvailability = new HashMap<>();
        hotelAvailability = new HashMap<>();
    }

    public void searchForFlights(String flightNumber) {
        if (flightAvailability.containsKey(flightNumber)) {
            System.out.println("Flight " + flightNumber + " is available.");
        } else {
            System.out.println("Flight " + flightNumber + " is not available.");
        }
    }

    public void searchForHotels(String hotelName) {
        if (hotelAvailability.containsKey(hotelName)) {
            System.out.println("Hotel " + hotelName + " is available.");
        } else {
            System.out.println("Hotel " + hotelName + " is not available.");
        }
    }

    public void bookFlight(String flightNumber) {
        if (flightAvailability.containsKey(flightNumber) && !flightAvailability.get(flightNumber)) {
            flightAvailability.put(flightNumber, true);
            System.out.println("Flight " + flightNumber + " booked successfully.");
        } else {
            System.out.println("Sorry, flight " + flightNumber + " is not available for booking.");
        }
    }

    public void bookHotel(String hotelName) {
        if (hotelAvailability.containsKey(hotelName) && !hotelAvailability.get(hotelName)) {
            hotelAvailability.put(hotelName, true);
            System.out.println("Hotel " + hotelName + " booked successfully.");
        } else {
            System.out.println("Sorry, hotel " + hotelName + " is not available for booking.");
        }
    }

    public void cancelFlight(String flightNumber) {
        if (flightAvailability.containsKey(flightNumber) && flightAvailability.get(flightNumber)) {
            flightAvailability.put(flightNumber, false);
            System.out.println("Flight " + flightNumber + " reservation canceled successfully.");
        } else {
            System.out.println("No active reservation found for flight " + flightNumber + ".");
        }
    }

    public void cancelHotel(String hotelName) {
        if (hotelAvailability.containsKey(hotelName) && hotelAvailability.get(hotelName)) {
            hotelAvailability.put(hotelName, false);
            System.out.println("Hotel " + hotelName + " reservation canceled successfully.");
        } else {
            System.out.println("No active reservation found for hotel " + hotelName + ".");
        }
    }
}

public class ReservationDemo {
    public static void main(String[] args) {
        ReservationManager reservationManager = new ReservationManager();

        // Search for flights and hotels
        reservationManager.searchForFlights("ABC123");
        reservationManager.searchForHotels("Grand Hotel");

        // Book a flight and a hotel
        reservationManager.bookFlight("ABC123");
        reservationManager.bookHotel("Grand Hotel");

        // Cancel a flight and a hotel reservation
        reservationManager.cancelFlight("ABC123");
        reservationManager.cancelHotel("Grand Hotel");
    }
}
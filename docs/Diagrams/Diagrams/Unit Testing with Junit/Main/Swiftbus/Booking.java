package Swiftbus;

/**
 * Booking class
 */
public class Booking {

    private int bookingId;
    private double pricePerSeat;
    private int numberOfSeats;

    // Default constructor
    public Booking() {
    }

    // Parameterized constructor
    public Booking(int bookingId, double pricePerSeat, int numberOfSeats) {
        this.bookingId = bookingId;
        this.pricePerSeat = pricePerSeat;
        this.numberOfSeats = numberOfSeats;
    }

    // Getter and Setter for bookingId
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    // Getter and Setter for pricePerSeat
    public double getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(double pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    // Getter and Setter for numberOfSeats
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    // Calculate total price
    public double calculateTotal() {
        return pricePerSeat * numberOfSeats;
    }
}


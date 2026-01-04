package Swiftbus;

public class Seat {

    private int seatId;
    private String seatNumber;
    private boolean isAvailable;
    private String seatType;
    private int busId;
    private double price;

    // Default constructor
    public Seat() {
        this.isAvailable = true; // Default seat availability
    }

    // Parameterized constructor
    public Seat(int seatId, String seatNumber, boolean isAvailable, String seatType, int busId, double price) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
        this.seatType = seatType;
        this.busId = busId;
        this.price = price;
    }

    // Getter and Setter methods
    public int getSeatId() { return seatId; }
    public void setSeatId(int seatId) { this.seatId = seatId; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public String getSeatType() { return seatType; }
    public void setSeatType(String seatType) { this.seatType = seatType; }

    public int getBusId() { return busId; }
    public void setBusId(int busId) { this.busId = busId; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Seat operations
    public boolean reserveSeat() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void releaseSeat() { isAvailable = true; }

    public boolean checkAvailability() { return isAvailable; }

    public String getSeatInfo() {
        return "Seat ID: " + seatId + ", Number: " + seatNumber + ", Type: " + seatType +
                ", Bus ID: " + busId + ", Price: " + price + ", Available: " + isAvailable;
    }
}

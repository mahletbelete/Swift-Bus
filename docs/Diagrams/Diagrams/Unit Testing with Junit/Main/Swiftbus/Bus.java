package Swiftbus;

/**
 * Bus class
 */
public class Bus {

    private int busId;
    private String plateNumber;
    private int capacity;
    private String busType;
    private String status;
    private Seat seat;

    // Default constructor
    public Bus() {
    }

    // Parameterized constructor
    public Bus(int busId, String plateNumber, int capacity, String busType, String status, Seat seat) {
        this.busId = busId;
        this.plateNumber = plateNumber;
        this.capacity = capacity;
        this.busType = busType;
        this.status = status;
        this.seat = seat;
    }

    // Getters and Setters
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    // Operations
    public void addBus() {
        // business logic placeholder
    }

    public void updateBus() {
        // business logic placeholder
    }

    public void removeBus() {
        // business logic placeholder
    }

    public String getBusInfo() {
        return "Bus ID: " + busId +
                ", Plate: " + plateNumber +
                ", Capacity: " + capacity +
                ", Type: " + busType +
                ", Status: " + status;
    }
}


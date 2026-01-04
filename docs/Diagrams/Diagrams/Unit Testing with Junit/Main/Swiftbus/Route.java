package Swiftbus;

public class Route {

    private int routeId;
    private String source;
    private String destination;
    private double fare;
    private Ticket ticket; // Assuming Ticket is another class

    // Default constructor
    public Route() {
    }

    // Parameterized constructor
    public Route(int routeId, String source, String destination, double fare, Ticket ticket) {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.ticket = ticket;
    }

    // Getters and setters
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // Route operations
    public void createRoute() {
        // Placeholder: implement logic if needed
    }

    public void updateRoute() {
        // Placeholder: implement logic if needed
    }

    public void deleteRoute() {
        // Placeholder: implement logic if needed
    }

    public String getRouteInfo() {
        return "Route ID: " + routeId + ", Source: " + source +
                ", Destination: " + destination + ", Fare: " + fare;
    }
}


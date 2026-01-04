package Swiftbus;

/**
 * Passenger class
 */
public class Passenger extends User {

    private int passengerID;
    private double walletBalance;
    private String preferredPaymentMethod;
    private AIChatbot aiChatbot;
    private Booking currentBooking;

    // Default constructor
    public Passenger() {
    }

    // Parameterized constructor
    public Passenger(int passengerID, String username, String password,
                     double walletBalance, String preferredPaymentMethod,
                     AIChatbot aiChatbot) {
        super(username, password);
        this.passengerID = passengerID;
        this.walletBalance = walletBalance;
        this.preferredPaymentMethod = preferredPaymentMethod;
        this.aiChatbot = aiChatbot;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public AIChatbot getAiChatbot() {
        return aiChatbot;
    }

    public boolean register() {
        return true;
    }

    public boolean login() {
        return true;
    }

    public void logout() {
        // logout logic
    }

    public void updateProfile() {
        // update logic
    }

    public Booking startBooking() {
        currentBooking = new Booking(1, 50.0, 2);
        return currentBooking;
    }

    public Payment makePayment(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return new Payment(amount);
        }
        return null;
    }

    public void viewBookingHistory() {
        // history logic
    }
}

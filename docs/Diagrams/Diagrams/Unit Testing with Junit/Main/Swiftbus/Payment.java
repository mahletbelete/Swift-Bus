package Swiftbus;

public class Payment {

    private int paymentId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private Date paymentDate;
    private Booking booking;

    // Default constructor
    public Payment() {
    }

    // Parameterized constructor
    public Payment(int paymentId, double amount, String paymentMethod,
                   String paymentStatus, Date paymentDate, Booking booking) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.booking = booking;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public boolean processPayment() {
        paymentStatus = "Processed";
        return true;
    }

    public boolean verifyPayment() {
        return "Processed".equals(paymentStatus);
    }

    public void refundPayment() {
        paymentStatus = "Refunded";
    }

    public String getPaymentDetails() {
        return "Payment ID: " + paymentId +
                ", Amount: " + amount +
                ", Method: " + paymentMethod +
                ", Status: " + paymentStatus;
    }
}


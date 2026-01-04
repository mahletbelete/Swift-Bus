package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    private Payment payment;

    @BeforeEach
    void setUp() {
        Booking booking = new Booking(101);
        Date date = new Date(1, 1, 2026);

        payment = new Payment(
                1,
                500.0,
                "Card",
                "Pending",
                date,
                booking
        );
    }

    @Test
    void testProcessPayment() {
        assertTrue(payment.processPayment());
        assertEquals("Processed", payment.getPaymentStatus());
    }

    @Test
    void testVerifyPayment() {
        payment.processPayment();
        assertTrue(payment.verifyPayment());
    }

    @Test
    void testRefundPayment() {
        payment.refundPayment();
        assertEquals("Refunded", payment.getPaymentStatus());
    }

    @Test
    void testPaymentDetails() {
        String details = payment.getPaymentDetails();
        assertNotNull(details);
        assertTrue(details.contains("Payment ID"));
    }
}

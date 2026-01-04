package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassengerTest {

    private Passenger passenger;

    @BeforeEach
    void setUp() {
        AIChatbot bot = new AIChatbot();
        passenger = new Passenger(
                101,
                "john",
                "password123",
                500.0,
                "Card",
                bot
        );
    }

    @Test
    void testPassengerId() {
        assertEquals(101, passenger.getPassengerID());
    }

    @Test
    void testLogin() {
        assertTrue(passenger.login());
    }

    @Test
    void testRegister() {
        assertTrue(passenger.register());
    }

    @Test
    void testStartBooking() {
        Booking booking = passenger.startBooking();
        assertNotNull(booking);
        assertEquals(100.0, booking.calculateTotal());
    }

    @Test
    void testMakePaymentSuccess() {
        Payment payment = passenger.makePayment(200.0);
        assertNotNull(payment);
        assertEquals(200.0, payment.getAmount());
    }

    @Test
    void testMakePaymentFailure() {
        Payment payment = passenger.makePayment(1000.0);
        assertNull(payment);
    }
}

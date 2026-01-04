package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookingTest {

    private Booking booking;

    @BeforeEach
    void setUp() {
        booking = new Booking(101, 50.0, 3);
    }

    @Test
    void testBookingId() {
        assertEquals(101, booking.getBookingId());
    }

    @Test
    void testPricePerSeat() {
        assertEquals(50.0, booking.getPricePerSeat());
    }

    @Test
    void testNumberOfSeats() {
        assertEquals(3, booking.getNumberOfSeats());
    }

    @Test
    void testCalculateTotal() {
        assertEquals(150.0, booking.calculateTotal());
    }

    @Test
    void testSetters() {
        booking.setPricePerSeat(100.0);
        booking.setNumberOfSeats(2);
        assertEquals(200.0, booking.calculateTotal());
    }
}

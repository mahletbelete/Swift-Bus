package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeatTest {

    private Seat seat;

    @BeforeEach
    void setUp() {
        seat = new Seat(1, "A1", true, "Regular", 101, 150.0);
    }

    @Test
    void testSeatIdGetterSetter() {
        seat.setSeatId(2);
        assertEquals(2, seat.getSeatId());
    }

    @Test
    void testSeatNumberGetterSetter() {
        seat.setSeatNumber("B2");
        assertEquals("B2", seat.getSeatNumber());
    }

    @Test
    void testAvailability() {
        assertTrue(seat.isAvailable());
        seat.reserveSeat();
        assertFalse(seat.isAvailable());
        seat.releaseSeat();
        assertTrue(seat.isAvailable());
    }

    @Test
    void testSeatTypeGetterSetter() {
        seat.setSeatType("VIP");
        assertEquals("VIP", seat.getSeatType());
    }

    @Test
    void testBusIdGetterSetter() {
        seat.setBusId(102);
        assertEquals(102, seat.getBusId());
    }

    @Test
    void testPriceGetterSetter() {
        seat.setPrice(200.0);
        assertEquals(200.0, seat.getPrice());
    }

    @Test
    void testReserveSeat() {
        assertTrue(seat.reserveSeat());
        assertFalse(seat.reserveSeat()); // Cannot reserve twice
    }

    @Test
    void testReleaseSeat() {
        seat.reserveSeat();
        seat.releaseSeat();
        assertTrue(seat.isAvailable());
    }

    @Test
    void testGetSeatInfo() {
        String info = seat.getSeatInfo();
        assertNotNull(info);
        assertTrue(info.contains("Seat ID: 1"));
    }
}

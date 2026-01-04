package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusTest {

    private Bus bus;
    private Seat seat;

    @BeforeEach
    void setUp() {
        seat = new Seat(1, true);
        bus = new Bus(10, "AB-1234", 50, "Luxury", "Active", seat);
    }

    @Test
    void testBusId() {
        assertEquals(10, bus.getBusId());
    }

    @Test
    void testPlateNumber() {
        assertEquals("AB-1234", bus.getPlateNumber());
    }

    @Test
    void testCapacity() {
        assertEquals(50, bus.getCapacity());
    }

    @Test
    void testBusType() {
        assertEquals("Luxury", bus.getBusType());
    }

    @Test
    void testStatus() {
        assertEquals("Active", bus.getStatus());
    }

    @Test
    void testSeatAssignment() {
        assertNotNull(bus.getSeat());
        assertTrue(bus.getSeat().isAvailable());
    }

    @Test
    void testGetBusInfo() {
        String info = bus.getBusInfo();
        assertTrue(info.contains("AB-1234"));
        assertTrue(info.contains("Luxury"));
    }
}

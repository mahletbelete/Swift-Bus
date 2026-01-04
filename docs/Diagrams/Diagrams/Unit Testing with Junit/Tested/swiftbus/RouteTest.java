package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RouteTest {

    private Route route;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        ticket = new Ticket(1); // Example ticket
        route = new Route(101, "Addis Ababa", "Bahir Dar", 500.0, ticket);
    }

    @Test
    void testRouteIdGetterSetter() {
        route.setRouteId(202);
        assertEquals(202, route.getRouteId());
    }

    @Test
    void testSourceGetterSetter() {
        route.setSource("Gondar");
        assertEquals("Gondar", route.getSource());
    }

    @Test
    void testDestinationGetterSetter() {
        route.setDestination("Mekelle");
        assertEquals("Mekelle", route.getDestination());
    }

    @Test
    void testFareGetterSetter() {
        route.setFare(750.0);
        assertEquals(750.0, route.getFare());
    }

    @Test
    void testTicketGetterSetter() {
        Ticket newTicket = new Ticket(2);
        route.setTicket(newTicket);
        assertEquals(newTicket, route.getTicket());
    }

    @Test
    void testGetRouteInfo() {
        String info = route.getRouteInfo();
        assertNotNull(info);
        assertTrue(info.contains("Addis Ababa") || info.contains("Bahir Dar"));
    }
}

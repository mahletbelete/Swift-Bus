package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {

    private Ticket ticket;
    private Date issueDate; // Assume Date class has getFormattedDate()

    @BeforeEach
    void setUp() {
        issueDate = new Date(1, 1, 2026); // Example date
        ticket = new Ticket(1, "", "", issueDate, new Bus());
    }

    @Test
    void testTicketIdGetterSetter() {
        ticket.setTicketId(2);
        assertEquals(2, ticket.getTicketId());
    }

    @Test
    void testTicketNumberSetterGetter() {
        ticket.setTicketNumber("T123");
        assertEquals("T123", ticket.getTicketNumber());
    }

    @Test
    void testQrCodeSetterGetter() {
        ticket.setQrCode("QR123");
        assertEquals("QR123", ticket.getQrCode());
    }

    @Test
    void testIssueDateSetterGetter() {
        Date newDate = new Date(2, 2, 2026);
        ticket.setIssueDate(newDate);
        assertEquals(newDate, ticket.getIssueDate());
    }

    @Test
    void testGenerateTicket() {
        ticket.generateTicket();
        assertEquals("TICKET-1", ticket.getTicketNumber());
        assertEquals("QR-1", ticket.getQrCode());
    }

    @Test
    void testValidateTicket() {
        assertFalse(ticket.isValidated());
        ticket.validateTicket();
        assertTrue(ticket.isValidated());
    }

    @Test
    void testGetTicketDetails() {
        ticket.generateTicket();
        ticket.validateTicket();
        String details = ticket.getTicketDetails();
        assertNotNull(details);
        assertTrue(details.contains("Ticket ID: 1"));
        assertTrue(details.contains("Validated: true"));
    }

    @Test
    void testBusSetterGetter() {
        Bus bus = new Bus();
        ticket.setBus(bus);
        assertEquals(bus, ticket.getBus());
    }
}

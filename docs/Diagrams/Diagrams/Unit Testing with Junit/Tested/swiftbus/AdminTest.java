package Swiftbus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdminTest {

    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin(1, 100, "System Admin", "admin@swiftbus.com");
    }

    @Test
    void testManageUsers() {
        assertEquals("Users managed successfully", admin.manageUsers());
    }

    @Test
    void testManageBuses() {
        assertEquals("Buses managed successfully", admin.manageBuses());
    }

    @Test
    void testManageRoutes() {
        assertEquals("Routes managed successfully", admin.manageRoutes());
    }

    @Test
    void testGenerateReport() {
        assertEquals("Report generated successfully", admin.generateReport());
    }

    @Test
    void testAdminId() {
        assertEquals(1, admin.getAdminId());
    }
}

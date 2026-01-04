package Swiftbus;

public class Admin extends User {

    private int adminId;

    // Default constructor
    public Admin() {
    }

    // Parameterized constructor (used in tests)
    public Admin(int adminId, int userId, String name, String email) {
        super(userId, name, email);
        this.adminId = adminId;
    }

    public int getAdminId() {
        return adminId;
    }

    public String manageUsers() {
        return "Users managed successfully";
    }

    public String manageBuses() {
        return "Buses managed successfully";
    }

    public String manageRoutes() {
        return "Routes managed successfully";
    }

    public String generateReport() {
        return "Report generated successfully";
    }
}


package Swiftbus;

public class Ticket {

    private int ticketId;
    private String ticketNumber;
    private String qrCode;
    private Date issueDate; // Assuming Date is another class
    private boolean isValidated;
    private Bus m_bus; // Associated bus

    // Default constructor
    public Ticket() {
        this.isValidated = false; // default
    }

    // Parameterized constructor
    public Ticket(int ticketId, String ticketNumber, String qrCode, Date issueDate, Bus m_bus) {
        this.ticketId = ticketId;
        this.ticketNumber = ticketNumber;
        this.qrCode = qrCode;
        this.issueDate = issueDate;
        this.m_bus = m_bus;
        this.isValidated = false;
    }

    // Getter and Setter methods
    public int getTicketId() { return ticketId; }
    public void setTicketId(int ticketId) { this.ticketId = ticketId; }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    public String getQrCode() { return qrCode; }
    public void setQrCode(String qrCode) { this.qrCode = qrCode; }

    public Date getIssueDate() { return issueDate; }
    public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }

    public boolean isValidated() { return isValidated; }
    public void setValidated(boolean validated) { isValidated = validated; }

    public Bus getBus() { return m_bus; }
    public void setBus(Bus m_bus) { this.m_bus = m_bus; }

    // Ticket operations
    public void generateTicket() {
        this.ticketNumber = "TICKET-" + ticketId;
        this.qrCode = "QR-" + ticketId;
    }

    public boolean validateTicket() {
        this.isValidated = true;
        return isValidated;
    }

    public String getTicketDetails() {
        return "Ticket ID: " + ticketId + ", Number: " + ticketNumber + ", QR: " + qrCode +
                ", Issue Date: " + (issueDate != null ? issueDate.getFormattedDate() : "N/A") +
                ", Validated: " + isValidated;
    }
}

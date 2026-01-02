

/**
 * @author hp
 * @version 1.0
 * @created 31-Dec-2025 2:53:17 PM
 */
public class ticket {

	private int ticketId;
	private string ticketNumber;
	private string qrCode;
	private date issueDate;
	private boolean isValidated;
	public bus m_bus;

	public ticket(){

	}

	public void finalize() throws Throwable {

	}
	public void generateTicket(){

	}

	public boolean validateTicket(){
		return false;
	}

	public string getTicketDetails(){
		return "";
	}
}//end ticket
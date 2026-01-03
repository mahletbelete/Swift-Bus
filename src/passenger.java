

/**
 * @author hp
 * @version 1.0
 * @created 31-Dec-2025 2:53:16 PM
 */
public class passenger extends user {

	private int passengerID;
	private double walletBalance;
	private string preferredPaymentMethod;
	public AI chatbot m_AI chatbot;

	public passenger(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean register(){
		return false;
	}

	public boolean login(){
		return false;
	}

	public void logout(){

	}

	public void updateProfile(){

	}

	public booking startBooking(){
		return null;
	}

	/**
	 * 
	 * @param amount
	 */
	public payment makePayment(double amount){
		return null;
	}

	public void viewBookingHistory(){

	}
}//end passenger
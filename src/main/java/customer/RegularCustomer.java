package customer;

public class RegularCustomer extends Customer {

	private boolean payLater;

	public RegularCustomer(String username, String forename, String surname, String address, String postcode, String phone, String email, String status, boolean payLater) {
		super(username, forename, surname, address, postcode, phone, email, status);
		this.payLater = payLater;
	}

	public RegularCustomer(String username, String forename, String surname, String phone, String email, String status) {
		super(username, forename, surname, phone, email, status);
		this.payLater = payLater;
	}

	public boolean getPayLater() {
		return this.payLater;
	}

	/**
	 * 
	 * @param payLater
	 */
	public void setPayLater(boolean payLater) {
		this.payLater = payLater;
	}

}
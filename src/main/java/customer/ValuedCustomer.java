package customer;

public class ValuedCustomer extends Customer {

	private String discountPlan;

	public ValuedCustomer(String username, String forename, String surname, String address, String postcode, String phone, String email, String status, String discountPlan) {
		super(username, forename, surname, address, postcode, phone, email, status);
		this.discountPlan = discountPlan;
	}

	public String getDiscountPlan() {
		return this.discountPlan;
	}

	/**
	 * 
	 * @param discountPlan
	 */
	public void setDiscountPlan(String discountPlan) {
		this.discountPlan = discountPlan;
	}

}
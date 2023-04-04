package discount_plan;

import customer.Customer;

import java.math.BigDecimal;

public class DiscountPlan {

	private String type;

	/**
	 * 
	 * @param type
	 */
	public DiscountPlan(String type) {
		this.type = type;
	}


	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
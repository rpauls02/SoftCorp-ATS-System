package sale;

import java.math.BigDecimal;

public class Payment {

	private String method;
	private BigDecimal amount;

	/**
	 * Record of payment is required after the sale of a ticket.
	 * These must be stored for at least six years
	 * @param method Payment method used to pay for ticket(s)
	 * @param amount Total amount of all ticket(s) created during sale
	 */
	public Payment(String method, BigDecimal amount) {
		this.method = method;
		this.amount = amount;
	}

	/**
	 * Returns the method of payment used to pay for ticket(s) requested by customer
	 * @return Payment method
	 */
	public String getMethod() {
		return this.method;
	}

	/**
	 * Sets the method of payment used to pay for ticket(s) requested by customer
	 * @param method Payment method used
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * Returns the total accumulated from subtotal and further taxes
	 * @return Total amount paid by customer
	 */
	public BigDecimal getAmount() {
		return this.amount;
	}

	/**
	 * Sets the total amount accumulated from subtotal and further taxes
	 * @param amount Accumulated total from sale
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
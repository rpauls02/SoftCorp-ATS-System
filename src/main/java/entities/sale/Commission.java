package entities.sale;

import java.math.BigDecimal;

public class Commission {

	private float rate;
	private BigDecimal amount;

	/**
	 * A collection of commission rates, agreed on through contract between an airline and travel agency,
	 * is set by an office manager of the travel agency
	 * These are applicable to a sale after it has been completed, and its amount displayed within a
	 * report when generated
	 * @param rate Applicable commission rate to a sale
	 * @param amount Amount resulting from applying commission rate
	 */
	public Commission(float rate, BigDecimal amount) {
		this.rate = rate;
		this.amount = amount;
	}

	/**
	 * Returns an applicable commission rate
	 * @return Float value specifying decimal rate
	 */
	public float getRate() {
		return this.rate;
	}

	/**
	 * Sets commission rate for a sale
	 * @param rate Float value specifying decimal rate
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}

	/**
	 * Returns amount resulting from applying a commission rate
	 * @return Resulting amount from applying commission rate
	 */
	public BigDecimal getAmount() {
		return this.amount;
	}

	/**
	 * Stores the amount resulting from applying a commission rate
	 * @param amount Collectible amount after applying commission
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
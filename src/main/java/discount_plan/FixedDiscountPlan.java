package discount_plan;

import java.math.BigDecimal;

public class FixedDiscountPlan extends DiscountPlan {

	private float rate;

	public FixedDiscountPlan(String type, float rate) {
		super(type);
		this.rate = rate;
	}

	public float getRate() {
		return this.rate;
	}

	/**
	 * 
	 * @param rate
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}
}
package discount_plan;

import customer.Customer;
import sale.Sale;

import java.math.BigDecimal;

public class FlexibleDiscountPlan extends DiscountPlan {

	private Customer customer;
	private Sale sale;
	private float rate;
	private BigDecimal zeroPercent = new BigDecimal(1000);
	private BigDecimal onePercent = new BigDecimal(1000);
	private BigDecimal twoPercent = new BigDecimal(2000);

	public FlexibleDiscountPlan(String type) {
		super(type);
		setType("FLEX");
		if (sale.getTotal().compareTo(zeroPercent) < 0)
			this.rate = 0;
		else if (sale.getTotal().compareTo(onePercent) >= 0 && sale.getTotal().compareTo(onePercent) < 0) {
			this.rate = 1;
		}
		else if (sale.getTotal().compareTo(twoPercent) >= 0) {
			this.rate = 2;
		}
	}

	public float getRate() {
		return this.rate;
	}
}
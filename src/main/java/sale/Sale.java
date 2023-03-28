package sale;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {

	private int id;
	private Date date;
	private String type;
	private String paymentMethod;
	private BigDecimal originalFare;
	private String iata;
	private BigDecimal exchangeRate;
	private BigDecimal convertedFare;
	private BigDecimal tax;
	private BigDecimal taxOther;
	private BigDecimal subTotal;
	private BigDecimal total;
	private boolean payLater;
	private BigDecimal totalPaid;

	/**
	 * @param id Formed using last 2 digits of year of sale and random generation of numbers
	 * @param date Date of sale, applied automatically when created
	 * @param type Type of sale performed during sale; can be either Interlines or Domestic
	 * @param paymentMethod Method of payment used for a sale, selected by advisor during sale
	 * @param originalFare Unconverted USD fare of ticket, where no IATA code is provided during sale phase
	 * @param iata Currency specified using a 3-letter code selected by the Travel Advisor during a sale
	 * @param exchangeRate Exchange rate used to convert fare from USD to alternate currency, dictated by IATA code
	 * @param convertedFare The fare after the appropriate exchange rate has been applied to the original fare
	 * @param tax Occurring taxes in relation to ticket
	 * @param taxOther Other occurring taxes in relation to ticket
	 * @param subTotal Comprised of all applicable taxes, and any further fees
	 * @param total Total amount, comprising either converted or unconverted fare and subtotal
	 * @param payLater Indicates if customer is paying later
	 * @param totalPaid The total amount paid by the customer after a sale has been recorded by the system
	 */
	public Sale(int id, Date date, String type, String paymentMethod, BigDecimal originalFare, String iata,
				BigDecimal exchangeRate, BigDecimal convertedFare, BigDecimal tax,
				BigDecimal taxOther, BigDecimal subTotal, BigDecimal total, boolean payLater, BigDecimal totalPaid) {

		this.id = id;
		this.date = date;
		this.type = type;
		this.paymentMethod = paymentMethod;
		this.originalFare = originalFare;
		this.iata = iata;
		this.exchangeRate = exchangeRate;
		this.convertedFare = convertedFare;
		this.tax = tax;
		this.taxOther = taxOther;
		this.subTotal = subTotal;
		this.total = total;
		this.payLater = payLater;
		this.totalPaid = totalPaid;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
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

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	/**
	 * 
	 * @param paymentMethod
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getOriginalFare() {
		return this.originalFare;
	}

	/**
	 * 
	 * @param originalFare
	 */
	public void setOriginalFare(BigDecimal originalFare) {
		this.originalFare = originalFare;
	}

	public String getIata() {
		return this.iata;
	}

	/**
	 * 
	 * @param iata
	 */
	public void setIata(String iata) {
		this.iata = iata;
	}

	public BigDecimal getExchangeRate() {
		// TODO - implement Sale.getExchangeRate
		throw new UnsupportedOperationException();
	}

	/**
	 * When selected, the
	 * @param exchangeRate
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		// TODO - implement Sale.setExchangeRate
		throw new UnsupportedOperationException();
	}

	public BigDecimal getConvertedFare() {
		return this.convertedFare;
	}

	/**
	 * 
	 * @param convertedFare
	 */
	public void setConvertedFare(BigDecimal convertedFare) {
		this.convertedFare = convertedFare;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	/**
	 * 
	 * @param tax
	 */
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTaxOther() {
		return this.taxOther;
	}

	/**
	 * 
	 * @param taxOther
	 */
	public void setTaxOther(BigDecimal taxOther) {
		this.taxOther = taxOther;
	}

	public BigDecimal getSubTotal() {
		return this.subTotal;
	}

	/**
	 * 
	 * @param subTotal
	 */
	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	/**
	 *
	 * @param total
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public boolean isPayLater() {
		return payLater;
	}

	public void setPayLater(boolean payLater) {
		this.payLater = payLater;
	}

	public BigDecimal getTotalPaid() {
		return this.totalPaid;
	}

	/**
	 * 
	 * @param totalPaid
	 */
	public void setTotalPaid(BigDecimal totalPaid) {
		this.totalPaid = totalPaid;
	}
}
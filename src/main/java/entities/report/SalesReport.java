package entities.report;

import java.util.Date;

public class SalesReport extends Report {

	private int[] ticketNumber;
	private String[] blankNumber;
	private int[] fareAmount;
	private int[] taxes;
	private int[] totals;
	private int[] cashPayment;
	private String[] ccNumber;
	private int[] originalTotal;
	private int[] convertedTotal;
	private int[] totalPaid;
	private int[] commissions;

	/**
	 * @param type
	 * @param agent
	 * @param agentNumber
	 * @param agentLocation
	 * @param salesPeriod
	 * @param preparedBy
	 * @param checkedBy
	 * @param approvedBy
	 * @param batchNbr
	 * @param reportNbr
	 * @param date
	 */
	public SalesReport(String type, String agent, int agentNumber, String agentLocation, String salesPeriod,
					   String preparedBy, String checkedBy, String approvedBy, int batchNbr, int reportNbr, Date date) {
		super(type, agent, agentNumber, agentLocation, salesPeriod, preparedBy, checkedBy, approvedBy, batchNbr,
				reportNbr, date);
	}


	public int[] getTicketNumber() {
		return this.ticketNumber;
	}

	/**
	 * 
	 * @param ticketNumber
	 */
	public void setTicketNumber(int[] ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String[] getBlankNumber() {
		return this.blankNumber;
	}

	/**
	 * 
	 * @param blankNumber
	 */
	public void setBlankNumber(int[] blankNumber) {
		// TODO - implement SalesReport.setBlankNumber
		throw new UnsupportedOperationException();
	}

	public int[] getFareAmount() {
		return this.fareAmount;
	}

	/**
	 * 
	 * @param fareAmount
	 */
	public void setFareAmount(int[] fareAmount) {
		this.fareAmount = fareAmount;
	}

	public int[] getTaxes() {
		return this.taxes;
	}

	/**
	 * 
	 * @param taxes
	 */
	public void setTaxes(int[] taxes) {
		this.taxes = taxes;
	}

	public int[] getTotals() {
		return this.totals;
	}

	/**
	 * 
	 * @param totals
	 */
	public void setTotals(int[] totals) {
		this.totals = totals;
	}

	public int[] getCashPayment() {
		return this.cashPayment;
	}

	/**
	 * 
	 * @param cashPayment
	 */
	public void setCashPayment(int[] cashPayment) {
		this.cashPayment = cashPayment;
	}

	public String[] getCCNumber() {
		// TODO - implement SalesReport.getCCNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ccNumber
	 */
	public void setCCNumber(String[] ccNumber) {
		// TODO - implement SalesReport.setCCNumber
		throw new UnsupportedOperationException();
	}

	public int[] getOriginalTotal() {
		return this.originalTotal;
	}

	/**
	 * 
	 * @param originalTotal
	 */
	public void setOriginalTotal(int[] originalTotal) {
		this.originalTotal = originalTotal;
	}

	public int[] getConvertedTotal() {
		return this.convertedTotal;
	}

	/**
	 * 
	 * @param convertedTotal
	 */
	public void setConvertedTotal(int[] convertedTotal) {
		this.convertedTotal = convertedTotal;
	}

	public int[] getTotalPaid() {
		return this.totalPaid;
	}

	/**
	 * 
	 * @param totalPaid
	 */
	public void setTotalPaid(int[] totalPaid) {
		this.totalPaid = totalPaid;
	}

	public int[] getCommissions() {
		return this.commissions;
	}

	/**
	 * 
	 * @param commissions
	 */
	public void setCommissions(int[] commissions) {
		this.commissions = commissions;
	}

}
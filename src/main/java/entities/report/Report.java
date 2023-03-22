package entities.report;

import java.util.Date;

public class Report {

	private String type;
	private String agent;
	private int agentNumber;
	private String agentLocation;
	private String salesPeriod;
	private String preparedBy;
	private String checkedBy;
	private String approvedBy;
	private int batchNbr;
	private int reportNbr;
	private Date date;

	/**
	 * 
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

	public Report(String type, String agent, int agentNumber, String agentLocation, String salesPeriod,
				  String preparedBy, String checkedBy, String approvedBy, int batchNbr, int reportNbr, Date date) {
		this.type = type;
		this.agent = agent;
		this.agentNumber = agentNumber;
		this.agentLocation = agentLocation;
		this.salesPeriod = salesPeriod;
		this.preparedBy = preparedBy;
		this.checkedBy = checkedBy;
		this.approvedBy = approvedBy;
		this.batchNbr = batchNbr;
		this.reportNbr = reportNbr;
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

	public String getAgent() {
		return this.agent;
	}

	/**
	 * 
	 * @param agent
	 */
	public void setAgent(String agent) {
		this.agent = agent;
	}

	public int getAgentNumber() {
		return this.agentNumber;
	}

	/**
	 * 
	 * @param aNumber
	 */
	public void setAgentNumber(int aNumber) {
		this.agentNumber = aNumber;
	}

	public String getAgentLocation() {
		return this.agentLocation;
	}

	/**
	 * 
	 * @param agentLocation
	 */
	public void setAgentLocation(String agentLocation) {
		this.agentLocation = agentLocation;
	}

	public String getSalesPeriod() {
		return this.salesPeriod;
	}

	/**
	 * 
	 * @param salesPeriod
	 */
	public void setSalesPeriod(String salesPeriod) {
		this.salesPeriod = salesPeriod;
	}

	public String getPreparedBy() {
		return this.preparedBy;
	}

	/**
	 * 
	 * @param preparedBy
	 */
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}

	public String getCheckedBy() {
		return this.checkedBy;
	}

	/**
	 * 
	 * @param checkedBy
	 */
	public void setCheckedBuy(String checkedBy) {
		// TODO - implement Report.setCheckedBuy
		throw new UnsupportedOperationException();
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	/**
	 * 
	 * @param approvedBy
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public int getBatchNbr() {
		return this.batchNbr;
	}

	/**
	 * 
	 * @param batchNbr
	 */
	public void setBatchNbr(int batchNbr) {
		this.batchNbr = batchNbr;
	}

	public int getReportNbr() {
		return this.reportNbr;
	}

	/**
	 * 
	 * @param reportNbr
	 */
	public void setReportNbr(int reportNbr) {
		this.reportNbr = reportNbr;
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

}
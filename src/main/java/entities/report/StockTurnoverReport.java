package entities.report;

import java.util.Date;

public class StockTurnoverReport extends Report{

	private String[] agentStock;
	private int[] advisorCode;
	private String[] advisorStock;
	private String[] assignedBlanks;
	private String[] usedBlanks;
	private String[] finalAgentAssigned;
	private String[] finalAdvisorAssigned;
	private int[] amounts;

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
	public StockTurnoverReport(String type, String agent, int agentNumber, String agentLocation,
							   String salesPeriod, String preparedBy, String checkedBy, String approvedBy,
							   int batchNbr, int reportNbr, Date date) {
		super(type, agent, agentNumber, agentLocation, salesPeriod, preparedBy, checkedBy, approvedBy, batchNbr,
				reportNbr, date);
	}


	public String[] getAgentStock() {
		return this.agentStock;
	}

	/**
	 * 
	 * @param agentStock
	 */
	public void setAgentStock(int[] agentStock) {
		// TODO - implement StockTurnoverReport.setAgentStock
		throw new UnsupportedOperationException();
	}

	public int[] getAdvisorCode() {
		return this.advisorCode;
	}

	/**
	 * 
	 * @param advisorCode
	 */
	public void setAdvisorCode(int[] advisorCode) {
		this.advisorCode = advisorCode;
	}

	public String[] getAdvisorStock() {
		return this.advisorStock;
	}

	/**
	 * 
	 * @param agentStock
	 */
	public void setAdvisorStock(String[] agentStock) {
		this.advisorStock = agentStock;
	}

	public String[] getAssignedBlanks() {
		return this.assignedBlanks;
	}

	/**
	 * 
	 * @param assignedBlanks
	 */
	public void setAssignedBlanks(String[] assignedBlanks) {
		this.assignedBlanks = assignedBlanks;
	}

	public String[] getUsedBlanks() {
		return this.usedBlanks;
	}

	/**
	 * 
	 * @param usedBlanks
	 */
	public void setUsedBlanks(String[] usedBlanks) {
		this.usedBlanks = usedBlanks;
	}

	public String[] getFinalAgentAssigned() {
		return this.finalAgentAssigned;
	}

	/**
	 * 
	 * @param finalAgentAssigned
	 */
	public void setFinalAgentAssigned(String[] finalAgentAssigned) {
		this.finalAgentAssigned = finalAgentAssigned;
	}

	public String[] getFinalAdvisorAssigned() {
		return this.finalAdvisorAssigned;
	}

	/**
	 * 
	 * @param finalAdvisorAssigned
	 */
	public void setFinalAdvisorAssigned(String[] finalAdvisorAssigned) {
		this.finalAdvisorAssigned = finalAdvisorAssigned;
	}

	public int[] getAmounts() {
		return this.amounts;
	}

	/**
	 * 
	 * @param amounts
	 */
	public void setAmounts(int[] amounts) {
		this.amounts = amounts;
	}

}
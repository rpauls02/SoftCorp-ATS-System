package entities.report;

import java.util.Date;

public class InterlineSalesReport extends SalesReport {

	private String[] exchDocuments;

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
	 *
	 */
	public InterlineSalesReport(String type, String agent, int agentNumber, String agentLocation,
								String salesPeriod, String preparedBy, String checkedBy, String approvedBy,
								int batchNbr, int reportNbr, Date date) {
		super(type, agent, agentNumber, agentLocation, salesPeriod, preparedBy, checkedBy, approvedBy, batchNbr,
				reportNbr, date);
	}


	public String[] getExchDocuments() {
		return this.exchDocuments;
	}

	/**
	 * 
	 * @param exchDocuments
	 */
	public void setExchDocuments(String[] exchDocuments) {
		this.exchDocuments = exchDocuments;
	}

	public InterlineSalesReport generate() {
		// TODO - implement IndividualInterlineSalesReport.generate
		throw new UnsupportedOperationException();
	}

}
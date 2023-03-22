package entities.report;

import java.util.Date;

public class DomesticSalesReport extends SalesReport {


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
	public DomesticSalesReport(String type, String agent, int agentNumber, String agentLocation,
							   String salesPeriod, String preparedBy, String checkedBy, String approvedBy,
							   int batchNbr, int reportNbr, Date date) {
		super(type, agent, agentNumber, agentLocation, salesPeriod, preparedBy, checkedBy, approvedBy, batchNbr,
				reportNbr, date);
	}

	public void generate() {
		// TODO - implement IndividualDomesticSalesReport.generate

	}

}
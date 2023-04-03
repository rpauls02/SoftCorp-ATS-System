package staff;

import staff.StaffAccount;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class TravelAdvisor extends StaffAccount {

    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    /**
     * @param id       Automatically generated and assigned 3 digit value
     * @param role     Role of staff member
     * @param forename First name(s) of staff member
     * @param surname  Surname(s) of staff member
     */
    public TravelAdvisor(int id, String password, String role, String forename, String surname) {
        super(id, password, role, forename, surname);
    }

    /**
     * @param id            Identifier for a sale object
     * @param date          Date of sale, applied automatically when created
     * @param type          Type of sale performed; can be either Interlines or Domestic
     * @param paymentType   Payment method used by customer to pay
     * @param originalFare  The original, unconverted fare of the sale
     * @param iata          A currency, specified using an IATA 3-letter code by the Travel Advisor during a sale
     * @param exchangeRate  The exchange rate applicable to the sale, depending on the IATA code selected by a
	 *                      Travel Advisor
     * @param convertedFare The fare after the appropriate exchange rate has been applied to the original fare
     * @param tax           Any taxes applicable to the sale
     * @param taxOther      Any other taxes applicable to the sale
     * @param subTotal      The total before taxes have been applied
     * @param total         The sum of all applicable fares and taxes
     * @param totalPaid     The total amount paid by the customer after a sale has been recorded by the system
     */
    public void createSale(int id, Date date, String type, String paymentType, BigDecimal originalFare, String iata,
                           BigDecimal exchangeRate, BigDecimal convertedFare, BigDecimal tax,
                           BigDecimal taxOther, BigDecimal subTotal, BigDecimal total, BigDecimal totalPaid) throws SQLException {

        /*Sale sale = new Sale();

        Random random = new Random();
        int upperBound = 500;
        int randInt = random.nextInt(upperBound);

        DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
        String year = df.format(Calendar.getInstance().getTime());
        String saleID = year + randInt;


        if (createTicketButton.isPressed()){ //if "Create Ticket" button has been pressed
            try{
                //TODO - Implement creation of sale when createTicket button is pressed
                conn.setAutoCommit(false);
                String updateTicketQuery = "UPDATE `ticket` SET status = 'Overdue' WHERE id = ?";
                conn.commit();

                if (sale.getIata() != null) {
                    String interlineSaleQuery = "INSERT INTO `sale` " +
                            "(id, sellDate, type, paymentMethod, originalFare, iata, exchangeRate, " +
                            "convertedFare, tax, taxOther, subTotal, total, payLater, totalPaid) " +
                            "VALUES (" + saleID + ", " + java.time.LocalDate.now() + ", " + sale.getType()
                            + ", " + sale.getPaymentMethod() + ", " + sale.getOriginalFare() + ", " + sale.getIata()
                            + ", " + sale.getExchangeRate() + ", " + sale.getConvertedFare() + ", " + sale.getTax()
                            + ", " + sale.getTaxOther() + ", " + sale.getSubTotal()
                            + ", " + sale.getTotal() + ", " + sale.isPayLater() + ", " + sale.getTotalPaid() + ")";
                    pstm = conn.prepareStatement(interlineSaleQuery);
                    rs = pstm.executeQuery();
                    conn.commit();
                } else {
                    String domesticSaleQuery = "INSERT INTO `sale` " +
                            "(id, sellDate, type, paymentMethod, originalFare, tax, taxOther, subTotal, " +
                            "total, payLater, totalPaid) " +
                            "VALUES (" + saleID + ", " + java.time.LocalDate.now() + ", " + sale.getType()
                            + ", " + sale.getPaymentMethod() + ", " + sale.getOriginalFare()
                            + ", " + sale.getTax() + "," + sale.getTaxOther() + ", " + sale.getSubTotal()
                            + ", " + sale.getTotal() + ", " + sale.isPayLater() + ", " + sale.getTotalPaid() + ")";
                    pstm = conn.prepareStatement(domesticSaleQuery);
                    rs = pstm.executeQuery();
                    conn.commit();
                }
                conn.setAutoCommit(true);
            } catch (SQLException sqle) {
                //TODO - Dialog stating sale cannot be recorded and to check entered details
            } finally {
                try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); };
                try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); };
                try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); };
            }
        }*/
    }

    /**
     * @param id       Identifier for a ticket object
     * @param status   The status of a ticket; can be either "Paid" or "Overdue" status
     */
    public void createTicket(int id, String status) {
        // TODO - implement TravelAdvisor.createTicket
        /*try{
            conn.setAutoCommit(false);
        } catch (SQLException sqle){
            //TODO - Dialog stating ticket cannot be created and to check entered details

        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); };
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); };
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); };
        }*/
    }

    /**
     * Applies a blank to a ticket if none has been applied already
     * @param blankNumber The number of blank to be applied to a ticket
     * @param ticketID    The ticket the blank will be applied too
     */
    public void applyBlank(String blankNumber, int ticketID) {
        // TODO - implement TravelAdvisor.applyBlank

    }

    /**
     * Allows advisor to edit details ticket if they've made a mistake
     * @param ticketID Identification of ticket to be altered
     */
    public void editTicket(int ticketID) {
        // TODO - implement TravelAdvisor.editTicket
    }

    /**
     * Allows advisor to void a blank if a mistake has been made during sale
     * @param blankNumber Identification of blank to be voided
     */
    public void voidBlank(String blankNumber) {
        // TODO - implement TravelAdvisor.voidBlank
        /*if (blankNumberTextField.getText().toString().equals(blankNumber)){
            try {
                String query = "UPDATE `blank` SET status = 'Void' WHERE number = ?";
                pstm = conn.prepareStatement(query);
                rs = pstm.executeQuery();
            } catch (SQLException sqle) {
                //TODO - Dialog stating blank number not found
            }
        }*/
    }

    /**
     *
     */
    public void generateIndividualReport() {
        // TODO - implement TravelAdvisor.generateIndividualReport
        /*switch (selectReportTypeButton.getText()){
            case "Domestic Sales" -> {
                if (selectReportTypeButton.getText().equals("Domestic")){
                    IndividualDomesticSalesReport.generate();
                    //TODO (GUI) - Show generated report within GUI
                }
            }

            case "Interline Sales" -> {
                if (selectReportTypeButton.getText()equals("Interline")) {
                    IndividualInterlineSalesReport.generate();
                    //TODO (GUI) - Show generated report within ReportFrame
                }
            }
        }*/
    }
}
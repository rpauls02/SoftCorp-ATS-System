import java.util.Date;

public class Alert {

	private final String type;
	private final String[] description;
	private Date date;

	/**
	 * 
	 * @param type Type of alert to be generated
	 * @param date Date of generated alert
	 */
	public Alert(String type, String[] description, Date date) {
		this.type = type;
		this.description = description;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	/**
	 *
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public Alert generateLatePaymentAlert() {
		// TODO - Implement return and generation of alert
		return null;
	}

}
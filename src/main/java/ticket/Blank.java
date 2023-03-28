package ticket;

public class Blank {

	private String number;
	private String type;
	private String status;

	/**
	 * Constructor for creating a blank required when creating a ticket to be sold to user
	 * @param number Identifies blank usage
	 * @param type Type of blank depending on number
	 * @param status Status of blank depending on use by advisor
	 */
	public Blank(String number, String type, String status) {
		this.number = number;
		this.type = type;
		this.status = status;
	}

	public String getNumber() {
		return this.number;
	}

	/**
	 * Sets number of blank
	 * @param number Number to be assigned
	 */
	public void setNumber(String number) {this.number = number;}

	public String getType() {
		return this.type;
	}

	/**
	 * Sets type of blank according to number
	 * @param type Type to be assigned
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	/**
	 * Sets status of blank depending on use by advisor
	 * @param status Status to be assigned
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
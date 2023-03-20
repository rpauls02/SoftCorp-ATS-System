package entities.ticket;

public class Ticket {

	private int id;
	private String status;

	/**
	 * 
	 * @param id
	 * @param status
	 */
	public Ticket(int id, String status) {
		this.id = id;
		this.status = status;
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

	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
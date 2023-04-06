package customer;

public class Customer {
	private String username;
	private String forename;
	private String surname;
	private String address;
	private String postcode;
	private String phone;
	private String email;
	private String status;
	private int salesCount;

	/**
	 *
	 * @param username
	 * @param forename
	 * @param surname
	 * @param address
	 * @param postcode
	 * @param phone
	 * @param email
	 * @param status
	 */

	public Customer(String username, String forename, String surname, String address, String postcode, String phone,
					String email, String status) {
		this.username = username;
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.postcode = postcode;
		this.phone = phone;
		this.email = email;
		this.status = status;
	}

	public Customer(String username, String forename, String surname, String phone, String email, String status) {
		this.username = username;
		this.forename = forename;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.status = status;
	}

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getForename() {
		return this.forename;
	}

	/**
	 * 
	 * @param forename
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}

	/**
	 * 
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
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

	public int getSalesCount() {
		return this.salesCount;
	}

	/**
	 *
	 * @param salesCount
	 */
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}

}
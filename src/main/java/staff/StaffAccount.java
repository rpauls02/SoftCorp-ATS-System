package staff;

import javax.swing.*;
import java.sql.*;

public abstract class StaffAccount {
	private int id;
	private String username;
	private String forename;
	private String surname;
	private String role;
	private String phone;
	private String email;

	/**
	 * 
	 * @param id Automatically generated and assigned 3 digit value
	 * @param role Role of staff member
	 * @param forename First name(s) of staff member
	 * @param surname Surname(s) of staff member
	 */

	public StaffAccount(int id, String role, String forename, String surname) {
		this.id = id;
		this.role = role;
		this.forename = forename;
		this.surname = surname;
	}

	/**
	 * Returns the ID assigned to a staff account
	 * @return ID of staff account
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Assigns provided ID to a staff account
	 * @param id ID to be assigned to staff account
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the username generated for a staff account
	 * @return Staff account username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Assigns a generated username to a staff account
	 * @param username Username to be set for account
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Returns the forename(s) stored for a specified staff account
	 * @return Staff member forename(s)
	 */
	public String getForename() {
		return this.forename;
	}

	/**
	 * Sets forename(s) for specified staff account
	 * @param forename Forename(s) to be set for account
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}


	/**
	 * Returns the surname(s) stored for a specified staff account
	 * @return Surname(s) of specified staff account
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Sets surname(s) for specified staff account
	 * @param surname Surname(s) to be set for account
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Returns role specified to a staff account
	 * @return Role of specified staff account
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 * Sets role for specified staff account
	 * @param role Role to be set for account
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Returns phone number specified to a staff account
	 * @return Staff member phone number
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Sets phone number for specified staff account
	 * @param phone Phone number to be set for account
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Returns company email specified to a staff account
	 * @return Staff member's company email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets company email for specified staff account
	 * @param email Email to be set for account
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
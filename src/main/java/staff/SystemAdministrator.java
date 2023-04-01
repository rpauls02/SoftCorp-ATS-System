package staff;

public class SystemAdministrator extends StaffAccount {

	/**
	 * @param id       Automatically generated and assigned 3 digit value
	 * @param role     Role of staff member
	 * @param forename First name(s) of staff member
	 * @param surname  Surname(s) of staff member
	 * @param phone    Phone number of staff member
	 * @param email    Company email generated for staff member
	 */

	public SystemAdministrator(int id, String password, String role, String forename, String surname, String phone, String email) {
		super(id, password, role, forename, surname, phone, email);
	}

	/**
	 * Edit details of a provided staff account
	 * @param id Staff account to be edited
	 */
	public void editStaffAccount(int id) {
		// TODO - implement SystemAdministrator.editStaffAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Remove a staff account no longer in use
	 * @param id ID of account to be removed
	 */
	public void removeStaffAccount(int id) {
		// TODO - implement SystemAdministrator.removeStaffAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * On receiving new stock of blanks from airlines, the travel agency needs to be able to add these to the system
	 * @param blankNumbers Blanks being added to system
	 */
	public void addBlank(String[] blankNumbers) {
		// TODO - implement SystemAdministrator.addBlank
		throw new UnsupportedOperationException();
	}

	/**
	 * For blanks no longer under regulatory archival, they can be removed from the system
	 * @param blankNumber Blank to be removed
	 */
	public void removeBlank(String blankNumber) {
		// TODO - implement SystemAdministrator.removeBlank
		throw new UnsupportedOperationException();
	}

	public void backupDatabase() {
		// TODO - implement SystemAdministrator.backupDatabase
		throw new UnsupportedOperationException();
	}

	/**
	 * Restoring a database using a provided database backup file, usually in .db format
	 * @param backupFile
	 */
	public void restoreDatabase(String backupFile) {
		// TODO - implement SystemAdministrator.restoreDatabase
		throw new UnsupportedOperationException();
	}

	public void editAgencyDetails() {
		// TODO - implement SystemAdministrator.editAgencyDetails
		throw new UnsupportedOperationException();
	}

}
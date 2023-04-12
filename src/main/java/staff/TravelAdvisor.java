package staff;

import staff.StaffAccount;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class TravelAdvisor extends StaffAccount {

    private int id;
    private String username;
    private String forename;
    private String surname;
    private String role;
    private String phone;
    private String email;

    /**
     * @param id       Automatically generated and assigned 3 digit value
     * @param role     Role of staff member
     * @param forename First name(s) of staff member
     * @param surname  Surname(s) of staff member
     */
    public TravelAdvisor(int id, String role, String forename, String surname) {
        super(id, role, forename, surname);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getForename() {
        return forename;
    }

    @Override
    public void setForename(String forename) {
        this.forename = forename;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
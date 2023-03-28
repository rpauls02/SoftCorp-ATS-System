import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Payment {
    private String description;
    private double amount;
    private LocalDate dueDate;
    private LocalDate paidDate;
    public Payment(String description, double amount, LocalDate dueDate, LocalDate paidDate) {
        this.description = description;
        this.amount = amount;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
    }
    public String getDescription() {
        return description;
    }
    public double getAmount() {
        return amount;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public LocalDate getPaidDate() {
        return paidDate;
    }
    public boolean isLate() {
        return paidDate.isAfter(dueDate);
    }
}
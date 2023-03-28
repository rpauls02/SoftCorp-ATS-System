import java.time.LocalDate;
import java.util.ArrayList;

public class RecordOfPayments {
    private ArrayList<Payment> payments;
    public RecordOfPayments() {
        payments = new ArrayList<>();
    }
    public void addPayment(String description, double amount, LocalDate dueDate, LocalDate paidDate) {
        Payment payment = new Payment(description, amount, dueDate, paidDate);
        payments.add(payment);
    }
    public double getTotalAmount() {
        double totalAmount = 0;
        for (Payment payment : payments) {
            totalAmount += payment.getAmount();
        }
        return totalAmount;
    }
    public void printPayments() {
        for (Payment payment : payments) {
            System.out.println(payment.getDescription() + ": " + payment.getAmount() + ", due date: " + payment.getDueDate() + ", paid date: " + payment.getPaidDate() + ", late: " + payment.isLate());
        }
    }


    //Testing
//    public static void main(String[] args) {
//        RecordOfPayments record = new RecordOfPayments();
//        LocalDate rentDueDate = LocalDate.of(2023, 3, 1);
//        LocalDate rentPaidDate = LocalDate.of(2023, 3, 5);
//        record.addPayment("Rent", 1000.0, rentDueDate, rentPaidDate);
//        LocalDate utilitiesDueDate = LocalDate.of(2023, 3, 15);
//        LocalDate utilitiesPaidDate = LocalDate.of(2023, 3, 20);
//        record.addPayment("Utilities", 200.0, utilitiesDueDate, utilitiesPaidDate);
//        LocalDate internetDueDate = LocalDate.of(2023, 3, 31);
//        LocalDate internetPaidDate = LocalDate.of(2023, 4, 5);
//        record.addPayment("Internet", 50.0, internetDueDate, internetPaidDate);
//        double totalAmount = record.getTotalAmount();
//        System.out.println("Total amount paid: " + totalAmount);
//        record.printPayments();
//    }


}

//
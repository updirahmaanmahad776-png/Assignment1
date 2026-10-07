import java.util.Date;

public class Loan {
    // Attributes
    private double annualInterestRate;   // in percent (default 2.5)
    private int numberOfYears;           // default 1
    private double loanAmount;           // default 1000
    private Date loanDate;               // creation date

    // Default constructor
    public Loan() {
        this(2.5, 1, 1000);
    }

    // Constructor with specified values
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();      // current date
    }

    // Accessors
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Mutators
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // monthlyPayment = (P * r) / (1 - (1 + r)^-n)
    public double getMonthlyPayment() {
        double r = annualInterestRate / 1200;   // monthly interest rate
        int n = numberOfYears * 12;             // total number of monthly payments
        if (r == 0) {
            return loanAmount / n;              // no interest case
        }
        return (loanAmount * r) / (1 - Math.pow(1 + r, -n));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    // Test
    public static void main(String[] args) {
        Loan loan1 = new Loan();
        System.out.println("Default loan:");
        System.out.printf("Monthly payment: %.2f%n", loan1.getMonthlyPayment());
        System.out.printf("Total payment:   %.2f%n", loan1.getTotalPayment());
        System.out.println("Date: " + loan1.getLoanDate());

        Loan loan2 = new Loan(5.5, 15, 250000);
        System.out.println("\nCustom loan:");
        System.out.printf("Monthly payment: %.2f%n", loan2.getMonthlyPayment());
        System.out.printf("Total payment:   %.2f%n", loan2.getTotalPayment());
    }
}
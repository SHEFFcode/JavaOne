/**
 * Created by jeremy.shefer on 4/15/17.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String phoneNumber;

    //contructor
    public Account() {
        System.out.println("Empty constructor call");
    }

    //overloaded constructor
    public Account(String number, double balance, String customerName, String customerEmailAddress, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public void Withdrawal(double amount) {
        if (this.balance - amount >= 0) {
            System.out.println("Withdrawal of " + amount + " processed. " + (this.balance - amount) + " remains.");
            this.balance -= amount;
        } else {
            System.out.println("Only " + this.balance + " is available in the account, cannot proceed.");
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

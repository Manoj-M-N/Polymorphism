//Method Overloading:Method having same name but different parameter
/*
 4 rules are applicable
 ----
 1) Method name should be same
 2) Number of parameters should be different
 3) Data type of parameters should be different
 4) Order of parameters should be different
 */
class Bank {

    // Withdraw using amount only
    void withdraw(double amount) {
        System.out.println("Withdrawing ₹" + amount + " in cash.");
    }

    // Withdraw using ATM card and amount
    void withdraw(String atmCardNumber, double amount) {
        System.out.println("Withdrawing ₹" + amount + " using ATM card: " + atmCardNumber);
    }

    // Withdraw using UPI and amount
    void withdraw(String upiId, double amount, boolean isUpi) {
        System.out.println("Withdrawing ₹" + amount + " via UPI: " + upiId);
    }

    // Withdraw using cheque number and amount
    void withdraw(int chequeNumber, double amount) {
        System.out.println("Withdrawing ₹" + amount + " using cheque: #" + chequeNumber);
    }

    // Withdraw using mobile number, PIN, and amount
    void withdraw(String mobileNumber, int pin, double amount) {
        System.out.println("Withdrawing ₹" + amount + " using mobile number: " + mobileNumber + " and PIN: " + pin);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.withdraw(5000);
        b.withdraw("ATM123456", 2000);
        b.withdraw("user@upi", 1500, true);
        b.withdraw(123456, 10000);
        b.withdraw("9876543210", 1234, 7500);
    }
}

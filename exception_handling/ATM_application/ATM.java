import java.util.*;
public class ATM {
    private int correctPin = 1234;
    private double balance = 1000.0;
    public void start() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter pin: ");
            int pin = sc.nextInt();
            checkPin(pin);
            System.out.print("amount to withdraw: ");
            double amount = sc.nextDouble();
            withdraw(amount);
            System.out.println("Remaining balance:" + balance);
        } catch (SecurityException e) {
            System.out.println("wrong pin");
        } catch (InsufficientBalanceException e) {
            System.out.println("insufficient balance");
        }
        finally {
            sc.close();
        }
    }
    private void checkPin(int pin) throws SecurityException {
        if (pin != correctPin) {
            throw new SecurityException("Incorrect PIN");
        }
    }
    private void withdraw(double amount) throws InsufficientBalanceException {
        if (amount>balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -=amount;
}
    public static void main(String[] args) {
        ATM atm =new ATM();
        atm.start();
}
}
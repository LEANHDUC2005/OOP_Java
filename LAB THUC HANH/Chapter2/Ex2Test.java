public class Ex2Test {
    public static void main(String[] args) {
        // Test: Create account with valid data
        BankAccount account = new BankAccount("12345", 1000.0);
        System.out.println("Initial balance: " + account.getBalance()); // Expected: 1000.0

        // Test: Deposit valid amount
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance()); // Expected: 1500.0

        // Test: Withdraw valid amount
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance()); // Expected: 1200.0

        // Test: Withdraw more than balance (should set balance to 0 as per implementation)
        account.withdraw(2000.0);
        System.out.println("Balance after overdraw attempt: " + account.getBalance()); // Expected: 0.0

        // Test: Constructor throws exception with empty account number
        try {
            new BankAccount("", 100);
            System.out.println("Failed: Empty account number not detected");
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Caught empty account number");
        }

        // Test: Deposit negative amount
        try {
            account.deposit(-100.0);
            System.out.println("Failed: Negative deposit not detected");
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Caught negative deposit");
        }

        // Test: Withdraw negative amount
        try {
            account.withdraw(-50.0);
            System.out.println("Failed: Negative withdraw not detected");
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Caught negative withdraw");
        }
    }
}
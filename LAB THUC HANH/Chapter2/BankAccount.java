public class BankAccount{
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber, double balance){
            if (balance < 0){
                throw new IllegalArgumentException("Balance must be positive");
            }
            if ( accountNumber == null || accountNumber.isEmpty()){
                throw new IllegalArgumentException("Account number is required");
            }
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void deposit(double moneyDeposit){
            if ( moneyDeposit < 0 ){
                throw new IllegalArgumentException("Money for deposit must be positive");
            }
            this.balance += moneyDeposit;
        }
        public void withdraw(double moneyDraw){
            if ( moneyDraw < 0 ){
                throw new IllegalArgumentException("Money for drawing must be positive");
            }
            if ( moneyDraw >= this.balance ){
                this.balance = 0.0;
                return;
            }
            this.balance -= moneyDraw;
            return;
        }
        public double getBalance(){
            return this.balance;
        } 
}


// Code review:

/*
How do I feel about this code?

- The logic is mostly correct. The basic functionality for a bank account (deposit, withdraw, constructor, and balance check) is implemented.
- The structure is simple and easy to follow. Methods are clear and single-purpose.
- There is a small typo in the constructor: 'accoutNumber' should be 'accountNumber'.

Readability for a newcomer:

- The code is quite readable for someone new.
- Variable names are descriptive (though 'moneyDeposit' and 'moneyDraw' could be improved to 'amountToDeposit' and 'amountToWithdraw' for clarity).
- Exception messages are specific, which helps beginners understand what went wrong.
- Overall, a beginner would likely understand this code, apart from the typo and possibly the logic in withdraw (setting balance to 0 if trying to withdraw more or equal to the current balance, instead of throwing an exception or preventing overdraft).

Suggestions:

1. Fix typo in the constructor: 'accoutNumber' → 'accountNumber'.
2. Consider throwing an exception when overdraw is attempted, instead of resetting balance to 0.
3. Improve variable names for clarity.
4. Add comments to explain each method for beginners.
*/

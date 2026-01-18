class BankAccount{
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance){
        if (balance < 0){
            throw new IllegalArgumentException("Balance must be positive");
        }
        if ( accountNumber == null || accoutnNumber.isEmpty()){
            throw new IllegalArgumentException("Account number is required");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public

    
    

}
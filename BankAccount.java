public class BankAccount {
    double balance;
    String accountnumber;
    public BankAccount(String accountnumber){
        this.accountnumber = accountnumber;
        this.balance =0;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println(amount+" Amount Deposited");
            System.out.println("Balance is "+balance);
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance-=amount;
            System.out.println("Amount withdraw");
            System.out.println("Balance is "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public static void main(String[] args) {
        BankAccount swapnil = new BankAccount("123");
        swapnil.deposit(1000);
        swapnil.withdraw(100);
    }
}

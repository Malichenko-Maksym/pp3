public class BankAccount {
    String owner;
    int balance;
    String clientNumber;
    int lastInflow;
    int lastOutflow;
    public void PutMoney(int amount) {
        lastInflow  = amount;
        balance += amount;
    }
    public void WithdrawMoney(int amount) {
        if (balance >= amount){
            lastOutflow  = amount;
            balance -= amount; 
        }
        else {
            System.out.println("Not enought money on balance");
        }
    }
    public void ShowBalance() {
      System.out.println(balance);
    }
  
  }
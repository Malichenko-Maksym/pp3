public class BankAccount {
    private String owner;
    private int accNumber;
    private int balance = 0;
    

    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.println(getBalance());
    }

    public BankAccount(String owner, int accNumber) {
        this.owner = owner;
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void depositMoney(int ammount) {
        balance+=ammount;
    }   
    
    public void withdrawMoney(int ammount) {
        if ((balance>=ammount) && (ammount<=500)){
        balance-=ammount; }
        else if (500<ammount){
            System.out.println("Hey, dude, too much at one time");
        } else {
            System.out.println("Hey, dude, you don`t have money");
        }
    }   

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Max Mal", 223322);
        b1.depositMoney(1400);
        b1.showBalance();
        b1.withdrawMoney(200);
        b1.showBalance();
        b1.withdrawMoney(1300);
    }

}
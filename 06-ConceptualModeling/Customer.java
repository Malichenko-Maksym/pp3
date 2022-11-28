public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void earnMoney(int amount) {
        balance += amount;
    }

    public void buySomething(Product someUselessItem){
        balance-=someUselessItem.getPrice();
    }

}

public class Seller {
    private String name;

    public String getName() {
        return name;
    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    Seller(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void sellSomethingTo(Product someUselessItem, Customer someBuyer) {
        balance += someUselessItem.getPrice();
        someBuyer.buySomething(someUselessItem);
    }

    public static void main(String[] args) {
        Seller s1 = new Seller("Adidas", 100);
        Customer c1 = new Customer("Max", 50);
        Product p1 = new Product("Milk", 10);
        Product p2 = new Product("Tea", 20);
        
        System.out.println(s1.getBalance());
        System.out.println(c1.getBalance());
        s1.sellSomethingTo(p2, c1);
        System.out.println(s1.getBalance());
        System.out.println(c1.getBalance());
        s1.sellSomethingTo(p1, c1);
        System.out.println(s1.getBalance());
        System.out.println(c1.getBalance());
    }
}

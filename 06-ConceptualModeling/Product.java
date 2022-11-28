public class Product {
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int price;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return name+":"+price/100.0+" zl";
    }

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    
}

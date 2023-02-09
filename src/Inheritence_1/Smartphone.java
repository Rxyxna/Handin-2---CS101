package Inheritence_1;

public class Smartphone extends Computer{
    private int price;

    // constructor
    public Smartphone(String brand, String color, int RAM, int price) {
        super(brand, color, RAM);
        this.price = price;
    }

    // Getter & setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Smartphone details
    public void smartphoneDetails() {
        computerDetails();
        System.out.println("Price: " + price);
    }
}

package Interface_1;

import Interface_1.FastFood;

public class Pizza implements FastFood {

    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String GetName() {
        return this.name;
    }

    @Override
    public Double GetPrice() {
        return this.price;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + this.name);

    }

    @Override
    public void serve() {
        System.out.println("Serving " + this.name);

    }

    @Override
    public String toString() {
        return "Interface_1.Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

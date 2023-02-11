import Inheritence_1.Laptop;
import Inheritence_1.Smartphone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Inheritance 1
        Laptop macbook = new Laptop("Apple", "Space Grey", 8, 2022);
        System.out.println("Macbook: ");
        macbook.getBrand();
        macbook.getColor();
        macbook.getRAM();
        macbook.laptopDetails();

        Smartphone iPhone = new Smartphone("Apple", "Gold", 12, 12000);
        System.out.println("iPhone:");
        iPhone.smartphoneDetails();
    }





}
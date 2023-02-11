import Inheritence_1.Laptop;
import Inheritence_1.Smartphone;
import Interface_1.Burger;
import Interface_1.FastFood;
import Interface_1.Pizza;
import Interface_1.Sandwich;
import Override.OldSchoolRap;
import Override.NewSchoolRap;
import Interface_2.Car;
import Interface_2.Vehicle;

import java.lang.invoke.VarHandle;

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

        // Interface 1
        FastFood [] foodStatus = {
                new Burger("Chicken Burger", 7.99),
                new Sandwich("Avocado Sandwich", 6.99),
                new Pizza("Kebab Pizza", 10.99),
        };
        for (int i = 0; i < foodStatus.length; i++) {
            foodStatus[i].prepare();
            foodStatus[i].serve();
        }

        // Interface 2
        Car car = new Car("BMW", "Black");
        System.out.println(car);

        Car car2 = new Car("Mercedes", "White");
        System.out.println(car2);

        // Override
        OldSchoolRap oldSchoolRap = new OldSchoolRap();
        NewSchoolRap newSchoolRap = new NewSchoolRap();

        oldSchoolRap.play();
        newSchoolRap.play();





    }












}
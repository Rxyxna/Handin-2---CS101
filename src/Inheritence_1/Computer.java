package Inheritence_1;

public class Computer {
    String brand;
    String color;
    int RAM;

    // Constructor
    public Computer(String brand, String color, int RAM) {
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
    }

    // Setter & Getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    // Inheritence_1.Computer details
    public void computerDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + RAM);
    }

}





package Interface_2;

public class Car implements Vehicle {
    String carBrand;
    String color;

    public Car(String carBrand, String color) {
        this.carBrand = carBrand;
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void changeGear(int a) {

    }

    @Override
    public void speedUp(int a) {

    }

    @Override
    public void applyBrakes(int a) {

    }

    @Override
    public String toString() {
        return "Car: " +
                "Brand = '" + carBrand + '\'' +
                ", color = '" + color + '\''
                ;
    }
}

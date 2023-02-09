package Inheritence_1;

public class Laptop extends Computer{
    private int releaseYear;

    // constructor
    public Laptop(String brand, String color, int RAM, int releaseYear) {
        super(brand, color, RAM);
        this.releaseYear = releaseYear;
    }

    // Getter & Setter
    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void laptopDetails() {
        computerDetails();
        System.out.println("Release year: " + releaseYear);
    }

}

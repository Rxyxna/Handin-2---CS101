package Modelling;

import Modelling.Employee;

public class Janitor extends Employee {
    private String cleaningArea;
    public Janitor(String name, String role, int id) {
        super(name, role, id);
    }

    public String getCleaningArea() {
        return cleaningArea;
    }

    public void setCleaningArea(String cleaningArea) {
        this.cleaningArea = cleaningArea;
    }
}

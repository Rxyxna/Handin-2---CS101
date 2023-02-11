package Modelling;

import Modelling.Employee;

public class Headmaster extends Employee {
    private String schoolPlanning;
    public Headmaster(String name, String role, int id) {
        super(name, role, id);
    }

    public String getSchoolPlanning() {
        return schoolPlanning;
    }

    public void setSchoolPlanning(String schoolPlanning) {
        this.schoolPlanning = schoolPlanning;
    }
}

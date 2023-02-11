package Modelling;

import Modelling.Employee;

public class ItAdmin extends Employee {
    private String technicalSkill;
    public ItAdmin(String name, String role, int id) {
        super(name, role, id);
    }

    public String getTechnicalSkill() {
        return technicalSkill;
    }

    public void setTechnicalSkill(String technicalSkill) {
        this.technicalSkill = technicalSkill;
    }
}

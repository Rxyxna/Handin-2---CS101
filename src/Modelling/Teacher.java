package Modelling;

import Modelling.Employee;

public class Teacher extends Employee {
    private String subject;
    public Teacher(String name, String role, int id) {
        super(name, role, id);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

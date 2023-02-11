package Modelling;

import Modelling.Classroom;
import Modelling.Employee;

import java.util.List;

public class School {
    private String name;
    private List<Employee> employees;
    private List<Classroom> classrooms;

    public School(String name, List<Employee> employees, List<Classroom> classrooms) {
        this.name = name;
        this.employees = employees;
        this.classrooms = classrooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }


}

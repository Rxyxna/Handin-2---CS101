package Modelling;

import java.util.ArrayList;

public class Students {
    private String Name;
    private int age;
    private int studentId;

    public Students(String name, int age, int studentId) {
        Name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

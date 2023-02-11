package Modelling;

import java.util.ArrayList;

public class Classroom {
    private String className;
    private ArrayList<Students> Students;

    public Classroom(String className, ArrayList<Students> students) {
        this.className = className;
        Students = students;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Students> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Students> students) {
        Students = students;
    }
}

package Modelling;

public class Employee {
    private String name;
    private String Role;
    private int id;

    // Constructor
    public Employee(String name, String role, int id) {
        this.name = name;
        Role = role;
        this.id = id;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



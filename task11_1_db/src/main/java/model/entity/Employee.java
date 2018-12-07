package model.entity;

public class Employee {
    private int id;
    private String surname;
    private String name;
    private String position;
    private String idDepartment;


    public Employee(int id, String surname, String name, String position, String idDepartment) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.idDepartment = idDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public String toString() {
        return "Employee " +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", idDepartment='" + idDepartment + '\'' +
                "\n";
    }
}

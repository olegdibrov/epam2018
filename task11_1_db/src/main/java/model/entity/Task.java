package model.entity;

import model.entity.Employee;

public class Task {
    private int id;
    private String description;
    private int employee;

    public Task(int id, String description, int employee) {
        this.id = id;
        this.description = description;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Task " +
                "id=" + id +
                ", description='" + description + '\'' +
                ", employee=" + employee;
    }
}

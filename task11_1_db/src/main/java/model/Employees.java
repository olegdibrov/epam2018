package model;

import model.entity.Employee;
import model.entity.Task;

import java.util.List;

public class Employees {
    private List<Employee> employees;
    private List<Task> tasks;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(int id, String description, int employee) {
        tasks.add(new Task(id, description, employee));
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + employees +
                ", tasks=" + tasks +
                '}';
    }
}

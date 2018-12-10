package view;

import model.entity.Employee;
import model.entity.Task;

import java.util.List;

public class View {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printTasks(List<Task> tasks) {
        for (Task task: tasks) {
            System.out.println(task);
        }
    }

    public void printEmployees(List<Employee> employees) {
        for (Employee employee: employees ) {
            System.out.println(employee);
        }
    }
}

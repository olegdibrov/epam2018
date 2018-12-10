package controller;

import dao.Connection;
import dao.EmployeeConnection;
import model.Employees;
import view.View;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
    Employees model = new Employees();
    View view = new View();
    Connection connection = new EmployeeConnection();


    public void run() {
        try {
            connection.setConnection();
            chooseAction();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void chooseAction() throws SQLException {
        Scanner sc = new Scanner(System.in);
        int action;
        boolean i = true;
        loop:
        while (i) {
            view.printMessage("Choose action:");
            view.printMessage("0 - EXIT");
            view.printMessage("1 - Show all employees");
            view.printMessage("2 - Show all tasks");
            view.printMessage("3 - Show all employees in department");
            view.printMessage("4 - Add task to employee");
            view.printMessage("5 - Show tasks on employee");
            action = sc.nextInt();
            switch (action) {
                case 0:
                    break loop;
                case 1:
                    model.setEmployees(connection.allEmployees());
                    view.printMessage("All employees");
                    view.printEmployees(model.getEmployees());
                    break;
                case 2:
                    System.out.println("All tasks");
                    model.setTasks(connection.allTasks());
                    view.printTasks(model.getTasks());
                    break;
                case 3:
                    System.out.println("List of employees in seller department");
                    model.setEmployees(connection.employeesInDepartment());
                    view.printEmployees((model.getEmployees()));
                    break;
                case 4:
                    connection.addTaskToEmployee();
                    model.setTasks(connection.allTasks());
                    view.printTasks(model.getTasks());
                    break;
                case 5:
                    view.printTasks(connection.employeeTasks());
            }
        }
    }
}

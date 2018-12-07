package controller;

import dao.Connection;
import dao.EmployeeConnection;
import model.Employees;

import java.sql.SQLException;

public class Controller {
    Employees model = new Employees();


    public void run() {
        try {
            Connection connection = new EmployeeConnection();
            //1)
            model.setEmployees(connection.allEmployees());
            System.out.println("All employees");
            System.out.println(model.getEmployees());
            //2)
            System.out.println("All tasks");
            model.setTasks(connection.allTasks());
            System.out.println(model.getTasks());
            //3)
            System.out.println("List of employees in seller department");
            model.setEmployees(connection.employeesInDepartment("Seller department"));
            System.out.println(model.getEmployees());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package service;

import dao.EmployeeConnection;
import model.entity.Employee;
import view.View;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static String inputString(View view) {
        while (true) {
            view.printMessage("Input String data");
            String text = sc.nextLine();
            if ( (text.length() >= 0)) {
                return text;
            }
            view.printMessage("Error input. Try again!");
        }
    }

    public static int inputSurname(View view, EmployeeConnection connection) throws SQLException {
        while (true) {
            view.printMessage("Input surname of employee");
            List<Employee> temp =  connection.allEmployees();
            String text = sc.next();
            for (Employee employee : temp) {
                if (employee.getSurname().equalsIgnoreCase(text)) {
                    return employee.getId();
                }
            }
            view.printMessage("Error input. Try again!");
        }
    }
}

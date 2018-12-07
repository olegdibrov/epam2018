package dao;

import com.sun.crypto.provider.DESCipher;
import model.Employees;
import model.entity.Employee;
import model.entity.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeConnection extends Connection {
    private static final String url = "jdbc:mysql://localhost:3306/mydb1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";

    public EmployeeConnection(String url, String user, String password) throws SQLException {
        super(url, user, password);
    }

    public EmployeeConnection() throws SQLException {
        super(url, user, password);
    }

    @Override
     public List<Employee> allEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
         try {
             stmt = connection.createStatement();
             String query = "SELECT * FROM employee";
             rs = stmt.executeQuery(query);
             while (rs.next()) {
                 employeeList.add(addEmployee(rs));
             }
         } catch (SQLException e) {
             System.err.println("Problem with connection to db");
         }
         finally {
             rs.close();
             stmt.close();
         }
         return employeeList;
     }

    @Override
    public List<Task> allTasks() throws SQLException {
        List<Task> tasks = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            String query = "SELECT * FROM task";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                tasks.add(addTask(rs));
            }
        } catch (SQLException e) {
            System.err.println("Problem with connection to db");
        }
        finally {
            rs.close();
            stmt.close();
        }
        return tasks;
    }

    // select * from employee where iddepartment = ALL (select iddepartment from department where nameOfDepartment = "Seller department");
    @Override
    public List<Employee> employeesInDepartment(String nameOfDepartment) throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            String query = "SELECT * FROM employee WHERE iddepartment = ANY(SELECT iddepartment FROM department WHERE nameOfDepartment =\"" + nameOfDepartment + "\") ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
               employeeList.add(addEmployee(rs));
            }
        } catch (SQLException e) {
            System.err.println("Problem with connection to db");
        }
        finally {
            rs.close();
            stmt.close();
        }
        return employeeList;
    }

    public Employee addEmployee(ResultSet rs) throws SQLException {
        return new Employee(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3),
                rs.getString(4), rs.getString(5));
    }

    public Task addTask(ResultSet rs) throws SQLException {
        return new Task((Integer.parseInt(rs.getString(1))), rs.getString(2), Integer.parseInt(rs.getString(3)));
    }

}

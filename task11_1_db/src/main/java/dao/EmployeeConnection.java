package dao;

import com.sun.crypto.provider.DESCipher;
import model.Employees;
import model.entity.Employee;
import model.entity.Task;
import service.InputUtility;
import view.View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeConnection extends Connection {

    @Override
    public void setConnection() throws SQLException {
        Properties property = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        url = property.getProperty("mydb1.url");
        user = property.getProperty("mydb1.user");
        password = property.getProperty("mydb1.password");
        super.setConnection();
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
        } finally {
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
        } finally {
            rs.close();
            stmt.close();
        }
        return tasks;
    }

    // select * from employee where iddepartment = ALL (select iddepartment from department where nameOfDepartment = "Seller department");
    @Override
    public List<Employee> employeesInDepartment() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        String nameOfDepartment = InputUtility.inputString(new View());
        try {
            stmt = connection.createStatement();
            String query = "SELECT * FROM employee WHERE iddepartment = ANY(SELECT iddepartment FROM department WHERE nameOfDepartment =\"" + nameOfDepartment + "\") ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                employeeList.add(addEmployee(rs));
            }
        } catch (SQLException e) {
            System.err.println("Problem with connection to db");
        } finally {
            rs.close();
            stmt.close();
        }
        return employeeList;
    }

    private void insert(PreparedStatement ps, String description, int employee) throws SQLException {
        ps.setNull(1, java.sql.Types.INTEGER);
        ps.setString(2, description);
        ps.setInt(3, employee);
        ps.executeUpdate();
    }

    public Employee addEmployee(ResultSet rs) throws SQLException {
        return new Employee(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3),
                rs.getString(4), rs.getString(5));
    }

    public Task addTask(ResultSet rs) throws SQLException {
        return new Task((Integer.parseInt(rs.getString(1))), rs.getString(2), Integer.parseInt(rs.getString(3)));
    }

    public void addTaskToEmployee() throws SQLException {
        try {
            String query = "INSERT INTO task VALUES(?,?,?)";
            ps = connection.prepareStatement(query);
            insert(ps, InputUtility.inputString(new View()), InputUtility.inputSurname(new View(), this));
        } catch (SQLException e) {
            System.err.println("Problem with connection to db");
        } finally {
            rs.close();
            stmt.close();
        }
    }

    public List<Task> employeeTasks() throws SQLException {
        List<Task> tasks= new ArrayList<>();
        try {
            stmt = connection.createStatement();
            String query = "Select * from task inner join employee on task.idemplyee=employee.idemplyee and employee.surname = \""
                    + InputUtility.inputString(new View()) + "\"";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                tasks.add(addTask(rs));
            }
        } catch (SQLException e) {
            System.err.println("No tasks for this person or person doesn't exist");
        } finally {
            rs.close();
            stmt.close();
        }
        return tasks;
    }


}

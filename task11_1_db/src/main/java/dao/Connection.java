package dao;

import model.entity.Employee;
import model.entity.Task;

import java.sql.*;
import java.util.List;

public abstract class  Connection {
    protected static java.sql.Connection connection;
    protected static Statement stmt;
    protected static ResultSet rs;
    protected static PreparedStatement ps;

    public  Connection(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public abstract List<Employee> allEmployees() throws SQLException;
    public abstract List<Task> allTasks() throws SQLException;
    public abstract List<Employee> employeesInDepartment(String nameOfDepartment) throws SQLException;
}

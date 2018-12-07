import controller.Controller;
import dao.Connection;
import dao.EmployeeConnection;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        new Controller().run();
    }
}

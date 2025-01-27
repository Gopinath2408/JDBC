package CollegeStudentDetailsJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    public Connection con;

    public dbConnection() throws SQLException {
        String userName = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/StudentDetails";
        con = DriverManager.getConnection(url, userName, password);
    }

}

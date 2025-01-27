import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {

        try {
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/ksr";

            int ids = 3;
            String name = "Ram";
            String email = "ram123@gmail.com";
            String query = "insert into student (id,stuname,email) values (3,  \"+name+\",  \"+email+\")";


            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            int count = st.executeUpdate(query);

            System.out.println(count+" "+"row/s affected");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

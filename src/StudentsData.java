import java.sql.*;

//This is code for fetching from the database

public class StudentsData {
    public static void main(String[] args) {

         try
         {
              String userName = "root";
              String password = "root";
              String url = "jdbc:mysql://localhost:3306/ksr";
              String query = "select * from student";


             Connection con = DriverManager.getConnection(url,userName,password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query);

             while(rs.next())
             {
                 System.out.println(rs.getInt(1)+" "+rs.getString(2));
             }
         } catch (Exception e) {
             System.out.println(e);
         }


    }
}

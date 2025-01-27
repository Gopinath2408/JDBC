package CollegeStudentDetailsJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetailsReport {
    public StudentDetailsReport() throws SQLException {
        dbConnection db =new dbConnection();
        Statement st = db.con.createStatement();
        String query1 = "Select count(*) as totalstrength from StudentInfo";
        String query2 = "Select dep as Department,count(*) as StudentCount  from StudentInfo group by dep";

        ResultSet rs = st.executeQuery(query1);
        if(rs.next()){
            System.out.println("Total Strength of the Strength: "+rs.getInt("totalstrength"));
        }

        System.out.println("Department wise Count");
        ResultSet rs1 = st.executeQuery(query2);

        while(rs1.next())
        {
            System.out.println("Department :"+ rs1.getString("Department"));
            System.out.print("Count :"+ rs1.getInt("StudentCount"));
            System.out.println();
        }

    }

}

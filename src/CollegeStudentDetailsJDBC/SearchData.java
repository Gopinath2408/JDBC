package CollegeStudentDetailsJDBC;

import java.sql.*;

public class SearchData {
    public SearchData(String searchName) {
        try {

            dbConnection db = new dbConnection();
            if (db.con == null) {
                System.out.println("Database connection failed.");
                return;
            }


            String query = "SELECT * FROM StudentInfo WHERE student = ?";
            PreparedStatement st = db.con.prepareStatement(query);
            st.setString(1, searchName);

            ResultSet rs = st.executeQuery();


            if (!rs.isBeforeFirst()) {
                System.out.println("No records found for the student: " + searchName);
                return;
            }


            while (rs.next()) {
                System.out.println("Name: " + rs.getString("student"));
                System.out.println("Department: " + rs.getString("Dep"));
                System.out.println("Mobile: " + rs.getString("Mobile"));
                System.out.println("Address: " + rs.getString("Address"));
            }


            rs.close();
            st.close();
            db.con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

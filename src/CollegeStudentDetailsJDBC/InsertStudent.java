package CollegeStudentDetailsJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

        Scanner x = new Scanner(System.in);
           public InsertStudent()
          {
            try {
                String userName = "root";
                String password = "root";
                String url = "jdbc:mysql://localhost:3306/StudentDetails";

                System.out.println("Enter the name of the Student");
                String name = x.nextLine();

                System.out.println("Enter the Department of the Student");
                String dep = x.nextLine();

                System.out.println("Enter the Mobile number of the student");
                String mobile = x.nextLine();

                System.out.println("Enter the Address of the Student");
                String Address = x.nextLine();


                String query = "insert into StudentInfo(student, Dep, Mobile, Address) values(?,?,?,?)";

                Connection con = DriverManager.getConnection(url, userName, password);
                PreparedStatement st = con.prepareStatement(query);

                st.setString(1, name);
                st.setString(2, dep);
                st.setString(3, mobile);
                st.setString(4, Address);

                int count = st.executeUpdate();


                System.out.println("Successfully Added");
            } catch (Exception e) {
                System.out.println(e);
            }

        }
}

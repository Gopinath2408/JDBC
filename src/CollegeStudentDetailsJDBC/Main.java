package CollegeStudentDetailsJDBC;

import java.sql.SQLException;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
       Scanner x =new Scanner(System.in);
        System.out.println("Welcome to the College Portal_____!");
        System.out.println("Choose the Option");
        System.out.println("1 . Insert new Student");
        System.out.println("2 . Search new Student");
        System.out.println("3 . Student Report Analysis");
        System.out.println("Choose the option 1 or 2");
        int option = x.nextInt();

        switch (option)
        {
            case 1:
                InsertStudent st = new InsertStudent();
                break;

            case 2 :
                System.out.println("Enter the name");
                String nam = x.next();
                SearchData se = new SearchData(nam);
                break;


            case 3:
                System.out.println("Report Analysis");
                StudentDetailsReport sr = new StudentDetailsReport();

            default:
                System.out.println("Choose the Correct Option");
        }
    }
}

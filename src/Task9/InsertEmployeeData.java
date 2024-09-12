package Task9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeeData {
        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/yourDatabase";
            String username = "Bala";
            String password = "Password";

            String insertSQL = "INSERT INTO Employee (empno, ename, age, sal) VALUES (?, ?, ?, ?)";

            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

                Object[][] employees = {
                        {101, "Jenny", 25, 10000},
                        {102, "Jacky", 30, 20000},
                        {103, "Joe", 20, 40000},
                        {104, "John", 40, 80000},
                        {105, "Shameer", 25, 90000}
                };

                for (Object[] emp : employees) {
                    pstmt.setInt(1, (int) emp[0]);
                    pstmt.setString(2, (String) emp[1]);
                    pstmt.setInt(3, (int) emp[2]);
                    pstmt.setDouble(4, (double) emp[3]);
                    pstmt.addBatch();
                }

                pstmt.executeBatch();
                System.out.println("Data inserted successfully!");

            } catch (SQLException e) {
                e.printStackTrace();
        }
  }

}

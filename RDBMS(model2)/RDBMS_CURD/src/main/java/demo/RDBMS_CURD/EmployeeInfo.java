package demo.RDBMS_CURD;

import java.sql.*;


public class EmployeeInfo {

	
		 private static final String URL = "jdbc:mysql://localhost:3306/assitopsmodel5";
		    private static final String USER = "root"; 
		    private static final String PASSWORD = ""; 

		    
		    public static void main(String[] args) {
		        Connection conn = null;
		        Statement stmt = null;
		        
		        try {
		            conn = DriverManager.getConnection(URL, USER, PASSWORD);
		            stmt = conn.createStatement();
		            
		            insertRecord(conn);
		            updateRecord(conn);
		            selectRecords(conn);
		            deleteRecord(conn);
		            
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                if (stmt != null) stmt.close();
		                if (conn != null) conn.close();
		            } catch (SQLException se) {
		                se.printStackTrace();
		            }
		        }
		    }

		    // Insert operation
		    public static void insertRecord(Connection conn) {
		        String insertQuery = "INSERT INTO employeeinfo (empid,firstname,lastname,email,gender,address) VALUES (5,'bhumika','chauhan', 'johndoe@example.com','female','maninagar')";
		        try (Statement stmt = conn.createStatement()) {
		            int rowsAffected = stmt.executeUpdate(insertQuery);
		            System.out.println(rowsAffected + " record inserted.");
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Update operation
		    public static void updateRecord(Connection conn) {
		        String updateQuery = "UPDATE employeeinfo SET email = 'johndfdfd.doe@example.com' WHERE firstname = 'bhumika'";
		        try (Statement stmt = conn.createStatement()) {
		            int rowsAffected = stmt.executeUpdate(updateQuery);
		            System.out.println(rowsAffected + " record updated.");
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Select operation (Display records)
		    public static void selectRecords(Connection conn) {
		        String selectQuery = "SELECT * FROM employeeinfo";
		        try (Statement stmt = conn.createStatement()) {
		            ResultSet rs = stmt.executeQuery(selectQuery);
		            while (rs.next()) {
		                int empid = rs.getInt("empid");
		                String firstname = rs.getString("firstname");
		                String lastname = rs.getString("lastname");
		                String email = rs.getString("email");
		                String gender = rs.getString("gender");
		                String address = rs.getString("address");
			               
		                System.out.println("ID: " + empid );
		                System.out.println("Firstname: " + firstname );
		                System.out.println("Lastname: " + lastname );
		                System.out.println("Email: " + email );
		                System.out.println("Gender: " + gender );
		                System.out.println("Address: " + address );
					             
		                
		                
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Delete operation
		    public static void deleteRecord(Connection conn) {
		        String deleteQuery = "DELETE FROM employeeinfo WHERE firstname = 'bhumika'";
		        try (Statement stmt = conn.createStatement()) {
		            int rowsAffected = stmt.executeUpdate(deleteQuery);
		            System.out.println(rowsAffected + " record deleted.");
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
	}
}

package JDBCDemo;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionTest {
	public static void main(String args[]) throws SQLException {
		Connection con=JDBCUtility.getConnection();
//		System.out.println(con);
		
		 Statement stmt =con.createStatement();
		 
		 
		 String createQuery =  "create table Intern(empno integer,ename varchar(20))";
		 String dltQuery = "drop table Intern";
		 String insertQuery1 = "insert into Intern values(2061, 'Rohan')";
		 String insertQuery2 = "insert into Intern values (1,'Mike')";
		 String insertQuery3 = "insert into Intern values (2, 'Sike')";
		 String insertQuery4 = "insert into Intern values (?,?)";
		 
//		 Create, Insert, Delete operations
		 int dlt = stmt.executeUpdate(dltQuery);
		 int create =  stmt.executeUpdate(createQuery);
		 int insert1 = stmt.executeUpdate(insertQuery1);
		 int insert2 = stmt.executeUpdate(insertQuery2);
		 int insert3 = stmt.executeUpdate(insertQuery3);
		 
		 int empId = 3;
		 String empName = "John";
		 PreparedStatement prepareStmt = con.prepareStatement(insertQuery4);
		 prepareStmt.setInt(1, empId);
		 prepareStmt.setString(2, empName);
		 
		 int insert4 = prepareStmt.executeUpdate();
		 
		 
		ResultSet rs = stmt.executeQuery("select * from Intern");
		while(rs.next())
			System.out.println(rs.getInt(1)+ " " + rs.getString(2));
		
		JDBCUtility.closeConnection(null, null);
	}
}

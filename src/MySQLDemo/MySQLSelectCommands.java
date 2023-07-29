package MySQLDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
            
		//create a connection to database
		//create query 
		//execute query
		//close connection
		
        //for select command
		//create a connection to database
		//create query 
		//execute query
		//close connection
		
		//create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//create query & Execute
		Statement stmt = con.createStatement();
		 
		 String st = "select * from student";
		
		
		//Store the data in resultset
		
		ResultSet rs = stmt.executeQuery(st);
		
		while(rs.next()) {
			int eid = rs.getInt("sno");
			String str = rs.getString("sname");
			
			System.out.println(eid+" "+str);
		}
		
		//close connection
		con.close();
	   
		System.out.println("Query Executed.....!");
	}

}

package MySQLDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLCommands {

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
		 
		 //insert
	     String s = "insert into student values(102,'kande')";
	     
	     //update
	     String S = "update student set sname='Rahul' where sno=102";
	     
	     //delete
	     String st = "delete from student where sno='102'";
		
		//executing
		stmt.execute(st);
		//close connection
		con.close();
	   
		System.out.println("Query Executed.....!");
	}

}

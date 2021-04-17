package mySqlPart;

import java.sql.*;

public class ExSqlConnection {
	  
	public static void main(String args[]){  
	try{  
	//step 1: Driver class for mysql is com.mysql.jdbc.Driver	
	Class.forName("com.mysql.jdbc.Driver"); 
	//step 2: Create connection object con
	//Connection url "jdbc:mysql://10.20.25.21:3306/forjava"
	//jdbc is the api; mysql is the database; 10.20.25.21 is the server name where mysql is present;
	//forjava is the database name, root is username and password

	Connection con=DriverManager.getConnection( "jdbc:mysql://servername:3306/forjava","username","password");   	
	//System.out.println("Connection established");
	//step 3:create statement 
	Statement stmt=con.createStatement();  
	//step 4: execute queries
	ResultSet rs=stmt.executeQuery("select * from student");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
	//step 5: Close connection con
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	 
}

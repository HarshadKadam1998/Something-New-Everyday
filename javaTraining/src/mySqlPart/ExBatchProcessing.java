package mySqlPart;

import java.sql.*;  

class ExBatchProcessing{  
	public static void main(String args[])throws Exception{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection( "jdbc:mysql://servername:3306/forjava","username","password");   
	con.setAutoCommit(false);  
	  
	Statement stmt=con.createStatement();  
	stmt.addBatch("update student set name='Kalpesh' where id=5"); 
	stmt.addBatch("insert into student values(16,'umesh',85)");  
	  
	stmt.executeBatch();//executing the batch  
	
	ResultSet rs = stmt.executeQuery("select * from student");
	while (rs.next()) {
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt("score"));
	}
	con.commit();  
	con.close();  
	}
}

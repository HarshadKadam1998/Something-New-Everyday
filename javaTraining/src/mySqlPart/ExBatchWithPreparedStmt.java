package mySqlPart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExBatchWithPreparedStmt {

	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection( "jdbc:mysql://servername:3306/forjava","username","password");   
		con.setAutoCommit(false); 
		
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Enter student id: ");
			String s1 = br.readLine();
			int id=Integer.parseInt(s1);
			
			System.out.println("Enter student name: ");
			String name = br.readLine();
			
			System.out.println("Enter student score: ");
			String s3 = br.readLine();
			int score=Integer.parseInt(s3);
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, score);
			stmt.addBatch();
			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")) {  
				break;  
			}
		}
		int[] count = stmt.executeBatch();
		System.out.println(count[0]+" Records added successfully");
		
		System.out.println("commit/rollback");  
		String answer=br.readLine();  
		if(answer.equals("commit")){  
		con.commit();  
		}  
		if(answer.equals("rollback")){  
		con.rollback();  
		}  
		
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);} 
	}
}

package mySqlPart;

import java.sql.*;  

public class ExInsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  

Connection con=DriverManager.getConnection( "jdbc:mysql://servername:3306/forjava","username","password");   


//for deleting a record
PreparedStatement stmt1=con.prepareStatement("delete from student where id=?");  
stmt1.setInt(1,4);  
int i=stmt1.executeUpdate();  
System.out.println(i+" records deleted");  


//For inserting a record
PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");  
stmt.setInt(1,4);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
stmt.setInt(3,78);

i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  

//For updating a record
PreparedStatement stmt2=con.prepareStatement("update student set name=? where id=?");  
stmt2.setString(1,"Mukta");//1 specifies the first parameter in the query i.e. name  
stmt2.setInt(2,1);  
  
i=stmt2.executeUpdate();  
System.out.println(i+" records updated"); 

con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
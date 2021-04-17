package com.dao;
import packageBankSystem.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

//import com.mysql.jdbc.Statement;

public class DatabaseStorageDao implements Idao {
	Connection con=null;	
	public void createConn() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");    
		con=DriverManager.getConnection("jdbc:mysql://servername:3306/databasename","username","password");
		//con.setAutoCommit(false); 
	}

	@Override
	public void saveAllCustomers(ArrayList<Customer> customers) {
		// TODO Auto-generated method stub
		//int m;
		//create table customers(CustomerId Integer(4) Primary key, CustomerName varchar(15), Age Integer(4), MobileNumber Integer(10), AadharNumber varchar(10), DOB varchar(15));
		//create table customers(CustomerId Integer primary key, CustomerName Varchar(20), Age Integer, MobileNumber Integer, AadharNumber Varchar(20), DOB Varchar(20));
		String sql="insert into customers(CustomerId, CustomerName, Age, MobileNumber, AadharNumber, DOB) values (?,?,?,?,?,?)";
		try{  
			createConn();
			String delete1="delete from accounts";
			PreparedStatement st1=con.prepareStatement(delete1);
			st1.executeUpdate();
			String delete2="delete from customers";
			PreparedStatement st2=con.prepareStatement(delete2);
			st2.executeUpdate();


		for(Customer c:customers){
			//if(/*!c.getIsSaved()*/c!=null){
				PreparedStatement stmt=con.prepareStatement(sql);
				stmt.setInt(1, c.getCustomerId());
				stmt.setString(2, c.getCustomerName());
				stmt.setInt(3, c.getAge());
				stmt.setInt(4, c.getMobileNumber());
				stmt.setString(5, c.getAadharNumber());
				stmt.setString(6, c.getDob());
				/*m =*/ stmt.executeUpdate();				
			//}
			Account a=c.getAccount();		
			//if(a!=null /*&& !a.isIssaved()*/){
//create table accounts(CustomerId Integer(4) , AccountNumber Integer(14), IFSC varchar(8), BankName varchar(12), Balance Integer(8), OpeningDate varchar(12), Type varchar(12),foreign key(CustomerId) references customers(CustomerId));				
//create table accounts(CustomerId Integer , AccountNumber Double, IFSC varchar(14), BankName varchar(16), Balance Integer, OpeningDate varchar(16), Type varchar(16),foreign key(CustomerId) references customers(CustomerId));
				String insertAccountSql="insert into accounts(CustomerId, AccountNumber, IFSC, BankName, Balance, OpeningDate, Type) values (?,?,?,?,?,?,?)";				
				PreparedStatement stmt1=con.prepareStatement(insertAccountSql);
				stmt1.setInt(1, c.getCustomerId());	
				stmt1.setDouble(2, a.getAccountNumber());
				stmt1.setString(3, a.getIfscCode());
				stmt1.setString(4, a.getBankName());
				stmt1.setDouble(5, a.getBalance());
				stmt1.setString(6, a.getOpeningDate());
				stmt1.setString(7, a.getType());
				/*m =*/ stmt1.executeUpdate();
			//}
			
		}
		//con.commit(); 		
		con.close();    
		}
		catch(Exception e){ System.out.println(e);}

	}

	@Override
	public ArrayList<Customer> retrieveAllCustomers() {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers=new ArrayList<Customer>();		
		Customer customer =null;
		Account account =null;
		try{
			createConn();
			Statement stmt2= con.createStatement(); 
			String sql="select * from customers c left join accounts a on c.CustomerId=a.CustomerId";
			ResultSet rs=stmt2.executeQuery(sql);
			while(rs.next()){
				//int customerId=rs.getInt("CustomerId");
				String customerName=rs.getString("CustomerName");
				int age=rs.getInt("Age");
				int mobileNumber=rs.getInt("MobileNumber");
				String aadharNumber=rs.getString("AadharNumber");
				String dob=rs.getString("DOB");
				customer= new Customer(customerName,age,mobileNumber,aadharNumber,dob);
				//customer.setIsSaved(true);
				if(rs.getString("Type")=="saving"){
					account= new SavingsAccount(rs.getString("Type"),(long)rs.getDouble("AccountNumber"),rs.getString("IFSC"),rs.getString("BankName"),rs.getDouble("Balance"),rs.getString("OpeningDate"));
				}else{
					account= new FixedDeposite(rs.getString("Type"),(long)rs.getDouble("AccountNumber"),rs.getString("IFSC"),rs.getString("BankName"),rs.getDouble("Balance"),rs.getString("OpeningDate"));
				}
				customer.setAc(account);
				customers.add(customer);
			} 
			//con.commit();  
			con.close(); 
			}
			catch(Exception e){ System.out.println(e);}

		return customers;
	}


}


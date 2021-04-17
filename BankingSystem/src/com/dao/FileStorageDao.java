package com.dao;
import packageBankSystem.*;
import java.util.ArrayList;

import java.io.*;

public class FileStorageDao implements Idao {

	@Override
	public void saveAllCustomers(ArrayList<Customer> customers) {
		// TODO Auto-generated method stub

		//for(Customer cuss:customers){
			try{
				FileOutputStream out =new FileOutputStream("customers.ser");
				ObjectOutputStream out1=new ObjectOutputStream(out);
					out1.writeObject(customers);
					out1.close();
					out.close();
				}
				catch(Exception ex){
					System.out.println(ex);
				}			
		//}

	}

	@Override
	public ArrayList<Customer> retrieveAllCustomers() {
		ArrayList<Customer> customers=new ArrayList<Customer>();		
		try{
			
		FileInputStream in1 =new FileInputStream("customers.ser");
		ObjectInputStream in=new ObjectInputStream(in1);
		customers=(ArrayList<Customer>)in.readObject();
			in.close();
			in1.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		for(Customer c1:customers){
			System.out.println(c1);
		}
		return customers;
	}

//-------------------------------------------------------------------------------------------------------------
	
	
	
}


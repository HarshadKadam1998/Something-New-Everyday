package ioOperations;

import java.io.*;
public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println("read data\n\n");
		System.out.println("Enter Name");
		String s= bf.readLine();
		System.out.println("Name: "+s);
		System.out.println("Enter Age");
		int a= Integer.parseInt(bf.readLine());		
		System.out.println("Age: "+a);
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}

}

package ioOperations;

import java.io.*;
public class FileInputStreamExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream out=null;
		FileInputStream in=null;

		byte b1=8;
		byte[] b2={1,2,3,4,5,6};
		String data= new String("Data conversion is required");
		byte[] b3=data.getBytes();
				
		try{
			out = new FileOutputStream("a.txt");
			out.write(b1);
			out.write(b2);
			out.write(b3);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				out.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
	
		}
		
		try{
			in = new FileInputStream("a.txt");
			int x;
			while((x=in.read())!=-1){
				System.out.print((char)x);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			
			try{
				in.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		

	}
}

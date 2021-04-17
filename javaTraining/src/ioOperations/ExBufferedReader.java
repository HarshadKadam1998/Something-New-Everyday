package ioOperations;

//Given By Teacher
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExBufferedReader {
	public static void main(String a[]) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter input data !!!");
		try {
			String s1 = br.readLine();
			System.out.println("Output="+s1);
			System.out.println("Enter Age");
			int age=Integer.parseInt(br.readLine());
			System.out.println("Age="+age);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		InputStreamReader r=new InputStreamReader(System.in);
		int i=0;
		System.out.println("Enter data 2");
		try {
			while((i=r.read())!=-1) {
				System.out.print((char)(i));
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}


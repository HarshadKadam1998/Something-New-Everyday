package serializationObject;
import java.io.*;
public class DeSerializationCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=null;
		try{
		FileInputStream in1 =new FileInputStream("SourceFileWithTransient.ser");
		ObjectInputStream in=new ObjectInputStream(in1);
			Object obj=in.readObject();
			e1=(Employee)obj;
			in1.close();
			in.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Name: "+e1.name);
//		System.out.println("address: "+e1.address);
		System.out.println("address: "+Employee.address);
		System.out.println("aadharNumber: "+e1.aadharNumber);
		System.out.println("number: "+e1.Number);
	}
}

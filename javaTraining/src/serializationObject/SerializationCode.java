package serializationObject;
import java.io.*;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class SerializationCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.name="Rahul";
		e.aadharNumber=5566;
		//e.address="pune";
		e.Number=2343;
		Employee.address="pune";
		try{
		FileOutputStream out =new FileOutputStream("SourceFileWithTransient.ser");
		ObjectOutputStream out1=new ObjectOutputStream(out);
			out1.writeObject(e);
			out1.close();
			out.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

}

package serializationObject;

import java.io.Serializable;
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
//	String address;
	int aadharNumber;
//	int number;
	static 	String address;
	transient int Number;

	
}

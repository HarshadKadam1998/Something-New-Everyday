package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student1 implements Comparable<Student1>{
	int rollno;
	String name;
	int age;
	
	Student1(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	
	@Override
	public int compareTo(Student1 arg0) {
//		System.out.println("Current roll no is:"+arg0.rollno);
//		System.out.println("next roll no is:"+rollno);
		if(rollno == arg0.rollno)
			return 0;
		else if(rollno > arg0.rollno)
			return 1;
		else 
			return -1;
		}
}

public class ExUserDefinedCompare_Comparable {

	public static void main(String[] args) {
		
		Student1 ss = new Student1(2,"Sharada",36);
		ArrayList<Student1> als = new ArrayList<Student1>();
		
		als.add(new Student1(10,"Vijay",40));
		als.add(new Student1(20,"Ravi",45));
		als.add(new Student1(1,"Asha",30));
		als.add(new Student1(5,"Lata",44));
		als.add(new Student1(8,"Ram",43));
		als.add(new Student1(15,"Shri",34));
		als.add(ss);
		
		Collections.sort(als);	//compareTo method will get called internally
		
		Iterator<Student1> itr = als.iterator();
		while(itr.hasNext()) {
			Student1 s1 = itr.next();
			System.out.println(s1.rollno+"\t"+s1.name+"\t"+s1.age);
		}
		

	}

}

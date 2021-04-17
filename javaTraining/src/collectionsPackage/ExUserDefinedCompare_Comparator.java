package collectionsPackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2{
	int rollno;
	String name;
	int age;
	
	Student2(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class RollNumberComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 arg0, Student2 arg1) {
		if(arg0.rollno == arg1.rollno)
			return 0;
		else if(arg0.rollno > arg1.rollno)
			return 1;
		else 
			return -1;
	}
	
}

class NameComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 arg0, Student2 arg1) {
		return arg0.name.compareTo(arg1.name);
	}
	
}

class AgeComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 arg0, Student2 arg1) {
		if(arg0.age == arg1.age)
			return 0;
		else if(arg0.age > arg1.age)
			return 1;
		else 
			return -1;
	}
	
}

public class ExUserDefinedCompare_Comparator {

	public static void main(String[] args){
		ArrayList<Student2> als = new ArrayList<Student2>();
		
		als.add(new Student2(10,"Vijay",40));
		als.add(new Student2(20,"Ravi",45));
		als.add(new Student2(1,"Asha",30));
		als.add(new Student2(5,"Lata",44));
		als.add(new Student2(8,"Ram",43));
		als.add(new Student2(15,"Shri",34));
		
		System.out.println("Sort by Roll Number");
		Collections.sort(als,new RollNumberComparator()); 	//internally calls the compare method
		Iterator<Student2> sr = als.iterator();
		while(sr.hasNext()) {
			Student2 stud = sr.next();
			System.out.println(stud.rollno+"\t"+stud.name+"\t"+stud.age);
		}

		System.out.println("Sort by Name");
		Collections.sort(als,new NameComparator()); 		//internally calls the compare method
		Iterator<Student2> sn = als.iterator();
		while(sn.hasNext()) {
			Student2 stud = sn.next();
			System.out.println(stud.rollno+"\t"+stud.name+"\t"+stud.age);
		}
		
		System.out.println("Sort by Age");
		Collections.sort(als,new AgeComparator()); 			//internally calls the compare method
		Iterator<Student2> sa = als.iterator();
		while(sa.hasNext()) {
			Student2 stud = sa.next();
			System.out.println(stud.rollno+"\t"+stud.name+"\t"+stud.age);
		}
	}

}


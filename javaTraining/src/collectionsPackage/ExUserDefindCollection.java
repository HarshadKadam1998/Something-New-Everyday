package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return rollno+"\t"+name+"\t"+age;
	}
}

public class ExUserDefindCollection {
	public static void main(String args[]) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Lakshman", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Sudhakar", 25);
		Student s4 = new Student(105, "Sai", 30);
		
		List<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(new Student(106, "Harsh", 3));
		//al.add("Java");
		System.out.println(al);
		//Collections.sort(al);
		Iterator<Student> itr = al.iterator();

		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
			//System.out.println(itr.next());
		}
	}
} 



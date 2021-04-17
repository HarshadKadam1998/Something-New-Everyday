package collectionsPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
public class arraylistImplemenataion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		a.add("Ram");
		a.add("prathmesh");
		a.add(0,"Harshad");
		a.add("Ram");
		a.add(0,"Mahesh");
//		a.add(null);
		
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println("Sort______________________");		
		for(String s:a){
			System.out.println(s);
		}
		System.out.println("Next______________________");		
		Iterator<String> itr=a.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("toArray______________________");		
		Object o[]=a.toArray();
		for(Object s:o){
			System.out.println((String)s);
		}
		
		System.out.println("Privious______________________");
		java.util.ListIterator<String>itr1=a.listIterator();
		
		while(itr1.hasPrevious()){
			System.out.println(itr1.previous());
		}		
		
		
	}

}

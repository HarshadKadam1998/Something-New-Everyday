package collectionsPackage;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> a=new HashMap<Integer,String>();
		a.put(101,"Ram");
		a.put(102,"prathmesh");
		a.put(105,"Harshad");
		a.put(104,"Ram");
		a.put(null,"Mahesh");
		a.put(null,"Kishor");
		
		System.out.println(a);
		
		Set<Integer> s=a.keySet();
		
		Iterator<Integer> itr=s.iterator();
		
		while(itr.hasNext()){
			System.out.println(a.get(itr.next()));
		}
		
		//
		System.out.println(a.get(102));
		System.out.println(a.containsKey(102));
		System.out.println(a.size());
		
		for(Map.Entry<Integer, String> t:a.entrySet()){
			System.out.println("key: "+t.getKey()+"      Value: "+t.getValue());
		}
		
		
	}

}

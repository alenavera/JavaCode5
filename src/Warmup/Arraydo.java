package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraydo {

	public static void main(String[] args) {
	//	ArrayList<String> s=new ArrayList<String>() {{
//		s.add("Germany");
//		s.add("Albania");
//		s.add("Bishkek");
//		s.add("Cyber");
//		s.add("Dania");
//		s.add("England");
//		
//		System.out.println(s);
//		for (int i = 0; i < s.size(); i++) {
//			System.out.println(s);
//			
//		  add("Delhi");
//		   add("Agra");
//		   add("Chennai");
//		   }};
//		System.out.println(s);
//	ArrayList<Integer> s=new ArrayList<Integer>(Collections.nCopies(4, 8)) ;
//		System.out.println(s);
		
		ArrayList<String> obj=new ArrayList<String>() ;
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		System.out.println("Current"+obj);
		 obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  obj.remove("Chaitanya");
		  obj.remove("Harry");
			System.out.println("Current"+obj);
			  obj.remove(1);
			  System.out.println("Current"+obj);
			  obj.add("hello");
			  System.out.println(obj);
			  obj.add(2, "bye");
			  System.out.println(obj);
			  obj.remove("Chaitanya");
			  System.out.println(obj);
		
		
		
		
				ArrayList<String> obj2=new ArrayList<String>() ;
		
				  obj2.add("Ahmed");
				  obj2.add("Arris");
				  obj2.add("jack");
				  obj2.add("Stuard");
		
		
		obj.addAll(obj2);
		System.out.println(obj);
		obj.remove(1);
		
		System.out.println(obj);
		obj.add(0,"Okan");
		System.out.println(obj); 
		obj.set(0,"KESHA");
		System.out.println(obj);
		
		obj.set(1,"Gulshan");
		System.out.println(obj);
		
	//	int k=obj.indexOf("Fatma");
		//System.out.println(k);
		int k1=obj.size();
		System.out.println(k1);
		boolean t=obj.contains("cybertek");
		System.out.println(t);
		obj.clear();
		obj.clear();
		System.out.println(obj);
		}}
		
		
		
		
		
		
		
		
		
		
		
		
		
	


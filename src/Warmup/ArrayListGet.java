package Warmup;

import java.util.ArrayList;

public class ArrayListGet {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		 System.out.println("Is ArrayList Empty: "+al.isEmpty());
		   al.add("pen");
	       al.add("pencil");
	       al.add("ink");
	       al.add("notebook");
	       al.add("book");
	       al.add("books");
	       al.add("paper");
	       al.add("white board");
	       System.out.println(al);
	       System.out.println(al.get(0));
	       System.out.println(al.get(1));
	       System.out.println(al.get(2));
	       System.out.println(al.get(3));
	     System.out.println(al.size());
	     System.out.println(al.indexOf("white board"));
	     System.out.println("Is ArrayList Empty: "+al.isEmpty());
	     System.out.println(al.size());
	     al.ensureCapacity(9);
	     al.add("GE");
	      // let us print all the elements available in list
	      for (String temp: al) {
	            System.out.println(temp);
	}

}}

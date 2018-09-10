package Warmup;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistLoop {
	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> r=new ArrayList<Integer>();
	r.add(10);
	r.add(20);
	r.add(30);
	r.add(40);
	r.add(50);
	
	
	
	System.out.println("FOR LOOP");
	for (int i = 0; i < r.size(); i++) {
		System.out.println(r.get(i)+" "+i);
	}
	System.out.println("For each loop");
	for(Integer p:r) {
		System.out.println(p);
	}
	System.out.println("WHILE LOOP");
	int count=0;
	while(r.size()>count) {
		
		System.out.println(r.get(count));
		count++;
	}
	System.out.println("DOWHILELOOP");
	
int count1=0;
do {
	System.out.println(r.get(count1));
	count1++;
	
	}while(r.size()>count1);
	
	
	
	
	
	
	}
}
	



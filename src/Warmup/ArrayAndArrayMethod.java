package Warmup;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayMethod {

	public static void main(String[] args) {
		
		
		
//		// Array
//		ArrayAndArrayList[] bank = new ArrayAndArrayList[5];
//		for (int k = 0; k < bank.length; k++) {
//			bank[0] = new ArrayAndArrayList("Zulley", "Smith", 1000.0);
//			bank[1] = new ArrayAndArrayList("Javy", "Michael", 2000.0);
//			bank[2] = new ArrayAndArrayList("Zam", "Samson", 3000.0);
//			bank[3] = new ArrayAndArrayList("Odey", "Harly", 4000.0);
//			bank[3] = new ArrayAndArrayList("Odeyoo", "Harly", 5000.0);
//			System.out.println(bank[1].getName() + "  " + bank[1].getLastname() + "  " + bank[0].getBalance());
//		}
//		
//	
//for(int r=0;r<=bank.length;r++) {
//	System.out.println(bank[r].getLastname()+" "+bank[r].getLastname()+" "+bank[r].getBalance());
	
//}

	ArrayList<ArrayAndArrayList> accounts = new ArrayList<ArrayAndArrayList>() ;
//
	ArrayAndArrayList t1 = new ArrayAndArrayList("Zulley", "Smith", 1000.0);
	ArrayAndArrayList t2 = new ArrayAndArrayList("Javy", "Michael", 2000.0);
	ArrayAndArrayList t3 = new ArrayAndArrayList("Zam", "Samson", 3000.0);
	ArrayAndArrayList t4 = new ArrayAndArrayList("Odey", "Harly", 4000.0);
	ArrayAndArrayList t5=new ArrayAndArrayList ("Odeyoo","Harly",5000.0);

	accounts.add(t1);
	accounts.add(t2);
	
	 accounts.add(t3);
	 accounts.add(t4);
	 accounts.add(t5);
	

	for(
	int i = 0;i<accounts.size();i++)
	{
		
		System.out.println(accounts.get(i).getName()+" "+accounts.get(i).getLastname()+" "+accounts.get(i).getBalance());
	}
	for(ArrayAndArrayList k:accounts) {
		System.out.println(k.getName()+k.getLastname()+k.getBalance());
	}
}}
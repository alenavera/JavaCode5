package Warmup;

import java.util.ArrayList;

public class ArrayListSize {

	public static void main(String[] args) {
		ArrayList<String> r=new ArrayList<>();
System.out.println(r.size());
//r.add(5);
//r.add(10);
//r.add(20);
//r.add(30);
//r.add(40);
//r.add(50);
//r.remove(0);
//System.out.println("size after removal"+" "+r.size());
//for(Integer f:r) {
//	System.out.println(f);


r.add("Okan");
r.add("Kesha");
r.add("Fatma");
r.add("Zeb");
r.add("Ziynash");
r.add("Busra");

boolean k=r.contains("Busra");
System.out.println(k);
ArrayList<String> r2=new ArrayList<>();

r2.add("Okan");
r2.add("Kesha");
r2.add("Fatma");
r2.add("Zeb");
r2.add("Ziynash");
r2.add("Busra");
boolean g=r2.contains("Fatma");
System.out.println(g);
System.out.println("===============================");
if(!r.equals(r2)) {
	System.out.println("TRUE");
}else {
	System.out.println("NOT equal");
}






}
	}



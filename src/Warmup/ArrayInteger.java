package Warmup;

import java.util.Scanner;

public class ArrayInteger {

	public static void main(String[] args) {
		int prices[]=new int[10];
	Scanner scanner=new Scanner(System.in);

	
	
	
		System.out.println("Enter your number");
//		prices[0]=scanner.nextDouble();
//		prices[1]=scanner.nextDouble();
	//	prices[2]=scanner.nextInt();
//		prices[3]=scanner.nextDouble();
		
		for(int i=0;i<prices.length;i++) {
					prices[i]=scanner.nextInt();
		
			System.out.println("price "+(i+1)+" "+prices[i]);
		}
//for(double eachDouble:prices) {
	//System.out.println("double value is:"+eachDouble);
}
//	double total=0d;
//	for(double eachDouble:prices) {
//		//total=total+eachDouble;
//		total+=eachDouble;
//	}
//	System.out.println(total);
//	}}


}
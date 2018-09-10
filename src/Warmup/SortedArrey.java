package Warmup;

import java.util.Arrays;

public class SortedArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]ints= { 5,100,2,19};
//		System.out.println(Arrays.binarySearch(ints,2));
//		System.out.println(Arrays.binarySearch(ints,7));
//		System.out.println(Arrays.binarySearch(ints,9));
//		System.out.println(Arrays.binarySearch(ints,15));
	
		//System.out.println(-----------------);
		
	
		int[]ints1= { 5,100,2,19,60};//2 5 19 60 100
		Arrays.sort(ints1);
	System.out.println(Arrays.binarySearch(ints1,1));
	System.out.println(Arrays.binarySearch(ints1,7));
	System.out.println(Arrays.binarySearch(ints1,10));
	System.out.println(Arrays.binarySearch(ints1,55));
	}}

package Warmup;

public class Array1 {

	public static void main(String[] args) {
//		String str ="KARASUt";
//System.out.println(str.charAt(str.length()-5));
//	
//int t=10;
//int k=--t +t++;//9+9=18//10
//
//System.out.println(k);
//System.out.println(t);//
//	int t=18;
//	int y=--t +t++ + --t + t++ -t++;
//	System.out.println(t);
//	System.out.println(y);
//		
	int [][]myArray={{5,7,1},{2,0,9},{3,6,9},{4,5,6}}	;
	for (int r = 0; r < myArray.length; r++) {
		for (int c = 0; c < myArray[r].length; c++) {
		int current=myArray[r][c]	;
		System.out.print(current+" ");
	
		}
	}
}
}
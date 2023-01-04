package ch02;

public class Test02 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 1000000;
		int i3 = i1 *i2;
		//int * int => int
		// long * int => long * long => long
		long l1 =(long)i1 *i2;
		System.out.println("i3 = " + i3);
		System.out.println("l1 = " + l1);
		
		
		
	}
}

package ch02;

public class Cast03 {

	public static void main(String[] args) {
		/*
		 * 응용문제03 
		 * 11.3 double d1 
		 * int i1에 대입 
		 * float f1에 d1 대입 
		 * double d2에 f1 대입 
		 * d1, i1, f1, d2를 출력
		 */

		double d1 = 11.3;
		int i1 = (int) d1;
		float f1 = (float) d1;
		double d2 = f1;
		System.out.println("d1 : "+d1);
		System.out.println("i1 : "+i1);
		System.out.println("f1 : "+f1);
		System.out.println("d2 : "+d2);

	}

}

package ch02;

public class Oper03 {

	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		// 2 * 4 + 3 * 6 
		
		int result2 = 2 * x-- + 3 * y++;
		int result = 2 * --x + 3 * ++y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
	}

}

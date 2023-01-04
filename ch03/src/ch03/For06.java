package ch03;

public class For06 {
	public static void main(String[] args) {
		int a, b;
		for (a = 5; a >=0; a--) {
			
			for (b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}

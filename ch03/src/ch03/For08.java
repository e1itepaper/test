package ch03;

public class For08 {

	public static void main(String[] args) {
		int a, b;
		for (a = 5; a > 0; a--) {
			
			for (b = 5; b > a; b--) { // For06  참고
				System.out.print(" ");
			}
			for (int c = 0; c < a; c++) { // For05  참고
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

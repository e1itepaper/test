package ch03;

public class For05 {

	public static void main(String[] args) {
		int a, b;
		for (a = 0; a < 5; a++) {
			
			for (b = 0; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

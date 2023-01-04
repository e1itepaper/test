package ch03;

public class Do05 {

	public static void main(String[] args) {
		int a = 2;
		int total;

		do {
			int b = 1;
			System.out.println("\n구구단 " + a + "단" );
			do {
				total = a * b;
				System.out.println(a + " * " + b + " = " + total);
				b++;
			} while (b < 10);
			a++;
		} while (a < 10);
	}

}

package ch03;

public class For04 {

	public static void main(String[] args) {
		int a, b, total;
		for (a = 2; a < 10; a++) {
			System.out.println("\n구구단 " + a + "단");
			for (b = 1; b < 10; b++) {
				total = a * b;
				System.out.println(a + " * " + b + " = " + total);
			}
		}
	}

}

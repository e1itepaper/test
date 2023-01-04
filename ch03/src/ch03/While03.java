package ch03;

public class While03 {

	public static void main(String[] args) {
		System.out.println("    구구단");
		System.out.println("===========");
		int i = 1;
		int j = 2;

		while (i < 10) {
			while (j < 10) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				j++;
			}
			i++;
			j = 2;
			System.out.println();
		}

	}

}

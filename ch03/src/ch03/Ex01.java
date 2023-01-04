package ch03;

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a < 21; a++) {
			if (a % 2 != 0 && a % 3 != 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

}

package ch03;

public class Ex02 {

	public static void main(String[] args) {
		int a;
		int sum = 0;
		int total = 0;
		for (a = 1; a < 11; a++) {

			sum += a;
			total+=sum;
			System.out.println("합계 : "+sum);
			System.out.println("누적 합계 : "+total);

		}
	}

}

package ch04;

public class TwoArr03 {

	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
				sum += a[i][j];
			}
			System.out.println("합계 : " + sum);
			sum = 0; // sum 초기화. 앞에서 계산했던 sum이 누적
		}

	}

}

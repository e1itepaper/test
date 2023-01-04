package ch04;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int sum1 = 0;
		// 일반 for
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		// 확장 for

		for (int i : arr) {
			sum1 += i;
		}
		System.out.println("합계 : " + sum1);
	}

}

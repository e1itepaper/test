package ch04;

public class Arr06 {

	public static void main(String[] args) {
		int[] score = { 77, 88, 66, 99, 56, 87, 92 };
		int sum = 0;
		float avg = 0.0f;
//		총점과 평균을 출력하시오

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (float) sum / (score.length);
		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
		
//		%.2f : 소수점 2자리까지 실수 출력
		System.out.printf("평균 : %.2f", avg);

	}

}

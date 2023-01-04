package ch04;

public class TwoArr04 {

	public static void main(String[] args) {
		String[] subject = { "국어", "영어", "수학", "총점", "평균" };
		int[][] score = { { 77, 88, 99 }, { 76, 68, 62 }, { 88, 77, 55 }, { 23, 99, 77 } };
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("\n======================================");
		int sum = 0;
		for (int a = 0; a < score.length; a++) {
			for (int b = 0; b < score[a].length; b++) {
				System.out.print(score[a][b] + "\t");
				sum += score[a][b];
			}
			System.out.print(sum + "\t");
			System.out.printf("%.2f\t",(float) sum / score[a].length);
			System.out.println();
			sum = 0;
			
		}

	}

}

package ch04;

public class Score01 {

	public static void main(String[] args) {
		String title = "\t\t<<성적표>>";
		String[] subject = { "이름", "국어", "영어", "수학", "총점", "평균" };
		String[] name = { "유지민", "김민정", "박지성", "나재민" };
		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 80, 80 } };
		int[] tot = new int[score[0].length];
		int len = 45;
		int sum = 0, tsum = 0;
		int ksum = 0, esum = 0, msum = 0;
		float avg = 0.0f, tavg = 0.0f;

		System.out.println(title);
		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();

		// subject출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
//			ksum += score[i][0];
//			esum += score[i][1];
//			msum += score[i][2];

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
//				sum += score[i][j];
//				avg = (float) sum / name.length;
				sum += score[i][j];     // 이름별 합계
				tot[j] += score[i][j];  // 과목별 합계

			}
			
//			tsum += sum;
//			System.out.print(sum + "\t");
//			System.out.printf("%.1f\t", avg);
//			avg = 0.0f;
//			tavg = (float) tsum / score.length;
			System.out.print(sum+"\t"+sum/score[i].length);
			sum = 0;
			System.out.println();

		}
		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.print("\n합계\t");

		for (int j = 0; j < tot.length; j++) {
			sum += tot[j];
			System.out.print(tot[j] + "\t");
		}

		System.out.println(sum + "\t" + sum / tot.length / name.length);

//		System.out.print(ksum + "\t");
//		System.out.print(esum + "\t");
//		System.out.print(msum + "\t");
//		System.out.print(tsum + "\t");
//		System.out.printf("%.1f\t", (float) tsum / score.length);

	}

}

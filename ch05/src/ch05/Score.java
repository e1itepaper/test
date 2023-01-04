package ch05;

public class Score {
	String title;
	String[] subject;
	String[] name;
	int[][] score;
	int len;
	int[] tot;
	int sum;

	public Score(String title, String[] subject, String[] name, int[][] score, int len) {
		this.title = title;
		this.subject = subject;
		this.name = name;
		this.score = score;
		this.len = len;
		tot = new int[score[0].length];
	}

	void print() {
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

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

				sum += score[i][j]; // 이름별 합계
				tot[j] += score[i][j]; // 과목별 합계

			}

			System.out.print(sum + "\t" + sum / score[i].length);
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
	}
}

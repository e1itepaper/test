package ch04;

public class Ex06 {

	public static void main(String[] args) {
		// 각 행별 합계, 최대, 최소
		// 전체 합계, 전체 최대, 최소
		int[][] score = { { 67, 78, 98 }, { 78, 100, 46 }, { 78, 56, 90 } };
		int sum = 0, tot = 0, max = 0, min = 100, tmax = 0, tmin = 100;
		String[] name= {"김민정","박지성","유지민"};
		System.out.println("이름\t국어\t영어\t수학\t합계\t최대\t최소\t");
		System.out.println("=====================================================");

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot += score[i][j];
				if (score[i][j] > max)
					max = score[i][j];
				if (score[i][j] < min)
					min = score[i][j];
				if (max > tmax)
					tmax = max;
				if (min < tmin)
					tmin = min;
			}
			System.out.print(sum + "\t");
			System.out.print(max + "\t");
			System.out.print(min + "\t");
			System.out.println();
			sum = 0;
			max = 0;
			min = 100;

		}
		System.out.println("=====================================================");

		System.out.print("\t총계 : " + tot + "\t");
		System.out.print("최대 : " + tmax + "\t");
		System.out.print("최소:" + tmin + "\t");

	}
}

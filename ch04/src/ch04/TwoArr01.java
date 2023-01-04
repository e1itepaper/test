package ch04;

public class TwoArr01 {

	public static void main(String[] args) {
		int[][] test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		// --------------------------------1행 초기화 끝
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		//-------------------------2행 초기화 끝 test.length : 행의 개수
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.println(test[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("==============");
		for (int[] te : test) {
			for (int t : te) {
				System.out.println(t + "\t");
			}
			System.out.println();
		}

	}

}

package ch04;

public class Ex03 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		// 행별로 합계, 전체 합계
		int sum1 = 0, sum2 = 0;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			int j = 0;
//			do {
//				sum1 += arr[i][j];
//				sum2 += arr[i][j];
//				j++;
//			} while (j < arr[i].length);
			
			for(j=0; j<arr[i].length;j++) {
				sum1 += arr[i][j];
				sum2 += arr[i][j];
			}
			System.out.println("arr[" + i + "] 합계 : " + sum1);
			sum1 = 0;
		}
		System.out.print("전체합계 : " + sum2);
	}

}

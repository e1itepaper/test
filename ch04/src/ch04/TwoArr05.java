package ch04;

public class TwoArr05 {

	public static void main(String[] args) {
		int[][] i1 = new int[3][];
		i1[0] = new int[2];
		i1[1] = new int[3];
		i1[2] = new int[4];
		i1[0][0] = 12; i1[0][1] = 12;
		i1[1][0] = 77; i1[1][1] = 55; i1[1][2] = 34; 
		i1[2][0] = 44; 	i1[2][1] = 77; i1[2][3] = 88;
//		일반 for문
		for(int i =0; i<i1.length; i++) {
			for(int j = 0; j<i1[i].length;j++) {
				System.out.print(i1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("================================");
//		확장 for문
		for(int[] ar : i1) {
			for(int arr : ar) {
				System.out.print(arr+"\t");
			}
			System.out.println();
		}
	}

}

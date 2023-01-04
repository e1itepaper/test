package ch04;

public class SelectSort01 {

	public static void main(String[] args) {
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int imsi = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {//바꿔치기
					imsi = score[i];
					score[i] = score[j];
					score[j] = imsi;

				}
			}
		}
		for (int i = 0; i<score.length;i++) {
			System.out.println(score[i]);
		}
	}
	

}

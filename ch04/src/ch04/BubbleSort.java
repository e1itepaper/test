package ch04;

public class BubbleSort {

	public static void main(String[] args) {
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int imsi = 0;
		for (int i = 0; i < score.length; i++) {
//											뒤부터 채워서 하나씩 setting
			for (int j = 0; j < score.length - (i + 1); j++) {
				if (score[j] > score[j + 1]) {
					imsi = score[j];
					score[j] = score[j + 1];
					score[j + 1] = imsi;
				}
			}
		}
		for(int i : score) {
			System.out.println(i);
		}

	}

}

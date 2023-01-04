package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
//		1 ~ 45 랜덤한 숫자 6자 맞추기
		int[] lotto = new int[6];
		int imsi = 0;
		for (int i = 0; i < lotto.length; i++) {
//							0 ~ 1 * 45 = 0 ~ 44 + 1 => 1 ~ 45
			lotto[i] = (int) (Math.random() * 45) + 1; // 같은 값이 들어갈 수 있음
//			앞에 데이터와 비교해서 같은 데이터가 있으면 다시 로또 번호 생성해야함
			for (int j = i - 1; j >= 0; j--) { // 현재 값 앞에 나온 로또값 비교 ~ 0까지
				if (lotto[j] == lotto[i]) {
					i--; // i번째 추가한 로또값 취소
					break; // 취소 됐으므로 더 이상 비교할 필요 없음
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					imsi = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = imsi;

				}
			}
		}
//			for (int i = 0; i < lotto.length; i++) {
		System.out.println(Arrays.toString(lotto));
//			}
	}
}

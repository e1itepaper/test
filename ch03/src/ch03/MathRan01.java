package ch03;

import java.util.Scanner;

public class MathRan01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Math.random(); 0 ~ 1 사이의 랜덤한 실수 0 이상이고 1미만인 실수
//		Math.random() * 100 : 0.4444 * 100 = 44.4444 0.9999 * 100 => 99.9999, 0.0000001 * 100 => 0.00001
//		(int) (Math.random() * 100) 44, 99, 0 : 0 ~ 99
//		(int) (Math.random() * 100) + 1; : 1 ~ 100
		int number = (int) (Math.random() * 100) + 1;
		System.out.println(number);

		int num = 0, cnt = 0;
		do {
			System.out.println("숫자를 맞춰보세요");
			num = sc.nextInt();
			if (num > number)
				System.out.println("작은 수를 입력하세요");
			if (num < number)
				System.out.println("큰 수를 입력하세요");
			cnt++;
		} while (num != number);
		System.out.printf("숫자 %d를 %d번에 맞췄습니다.", number, cnt);
		sc.close();
	}

}

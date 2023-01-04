package ch04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		4자리 년도를 입력 받아서 윤년, 평년 출력, 0으로 종료
//		4로 나누어 떨어지고 100으로 나누면 안 떨어지는 경우
//		400나누어 떨어지는 경우

		Scanner sc = new Scanner(System.in);
		int year = 0;
		while (true) {
			System.out.println("연도를 입력하세요");
			year = sc.nextInt();
			if (year == 0) {
				break;
			} // &&와 || 있을 경우에는 && 아래 문장에 ()생략
			else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "년은 윤년입니다.");
			} else {
				System.out.println(year + "년은 평년입니다.");
			}
		}
			System.out.println("종료합니다.");
			sc.close();
	}

}

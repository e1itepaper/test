package ch05;

import java.util.Scanner;

public class Final02 {
	public static void main(String[] args) {
//		변경 불가한 변수, 목적 프로그램 이해를 쉽게
		final int CIRCLE = 1;
		final int TRIANGLE = 2;
		final int RECTANGGLE = 3;
//		외부로부터 1, 2, 3, 정수를 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1/2/3 중 하나를 입력하세요");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("원입니다.");
			break;
		case 2:
			System.out.println("삼각형입니다.");
			break;
		case 3:
			System.out.println("사각형입니다.");
			break;
		default:
			System.out.println("숫자를 다시 확인하시고 1/2/3 중 하나를 입력하세요");
		}
		sc.close();
	}
}

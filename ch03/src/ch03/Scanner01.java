package ch03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		do {
			System.out.println("문자열을 입력하세요");
			msg = sc.nextLine(); // 문자열 한줄 읽기 (enter포함 \r\n)
			System.out.println("입력한 문자열 : " + msg);
//			같다 : 문자는 equals, 숫자는 ==
			if (msg.equals("x"))
				break;
		} while (true); // 무한

		System.out.println("프로그램 종료");
		sc.close();
	}

}

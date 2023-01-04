package ch03;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String msg = "";
		do {

			System.out.println("정수를 입력하세요");
			num = sc.nextInt();
//			숫자와 문자를 교대로 읽을 때 처리하는 방법
			System.out.println("입력한 숫자 : "+num);
			System.out.println("문자열을 입력하세요");
			msg=sc.nextLine(); // 숫자 입력할 때 사용한 enter를 읽어서 처리
			System.out.println("입력한 문자 : "+msg);
			if(msg.equals("x")) break;
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}

}

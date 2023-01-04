package ch03;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
//		Scanner 사용 		콘솔에서 데이터를 받겠다.
//		Scanner : 콘솔에서 데이터를 읽을 때 사용하는 클래스
//		Integer.parseInt() : 숫자형식의 문자를 정수로 변경
//		int num = Integer.parseInt(args[0]); // 명령문을 실행할 때 인수에 데이터를 전달하는 것을 받아서 사용
//		int num = System.in.read();
//		콘솔로부터 한 문자를 받을 때 사용
//		Scanner 콘솔로부터 데이터를 읽을 때 사용하는 도구
//		nextLine() 자열을 읽을 때 사용
//		nextInt() 정수를 읽을 때 사용
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("정수를 입력하세요");
			num = sc.nextInt(); // Scanner를 사용해서 정수를 읽어라 12 + enter
			System.out.println("입력한 숫자 : " + num);
		} while (num != 0);
		sc.close(); // Scanner 사용종료
	}

}

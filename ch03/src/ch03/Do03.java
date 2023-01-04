package ch03;

import java.io.IOException;

public class Do03 {

	public static void main(String[] args) throws IOException {
		int num = 0;
//		do ~ while을 사용하면 조건이 맞을 때까지 반복 실행이 가능
		do {
//			7을 입력하고 enter, enter => CR(13) + LF(10)
			System.out.println("한 자리 짝수를 입력하세요");
			num = System.in.read() - '0';// 48
			System.in.read(); //CR \r 처리
			System.in.read(); //LF \n 처리
			System.out.println("입력한 수 : " + num);
		} while (num % 2 != 0);
		System.out.println("입력한 짝수 : " + num);
	}

}

package ch03;

import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException {
		System.out.println("정수 한자리를 입력하세요");
//		콘솔에 입력한 한 글자를 읽는다.(아스키 코드) 1 -> 49
		int num = System.in.read() - '0'; //48
		System.out.println(num);
	}

}

package ch03;

import java.io.IOException;

public class Do02 {

	public static void main(String[] args) throws IOException {
		// 한자리 정수를 받아서 해당하는 구구단 출력 do ~ while로 작성
		System.out.println("보고 싶은 구구단?(1~9)");
		int num = 1;

		int b = 1;
		int total;
		do {
			num =System.in.read()-'0';
			System.in.read();
			System.in.read();
			do {
				total = num * b;
				System.out.println(num + " * " + b + " = " + total);
				b++;
			} while (b < 10);
			num++;
		} while (num < 10);

	}

}

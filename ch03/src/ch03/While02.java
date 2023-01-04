package ch03;

import java.io.IOException;

public class While02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고 싶은 구구단?(1~9)");
		int num = System.in.read() - '0';
		// 해당하는 구구단을 출력하는 프로그램 작성
		int b = 1;
		int total;
		while (num < 10) {
			while (b < 10) {
				total = num * b;
				System.out.println(num + " * " + b + " = " + total);
				b++;
			}
			num++;
		}

	}

}

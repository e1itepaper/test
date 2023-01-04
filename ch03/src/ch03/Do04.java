package ch03;

import java.io.IOException;

public class Do04 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("보고 싶은 구구단?");
		int num = 1;
		int a = 1;
		int total;
		do {
			num = System.in.read() - '0';
			System.in.read();
			System.in.read();
			do {

				total = num * a;
				System.out.println(num + " * " + a + " = " + total);
				a++;
			} while (a < 10);
			num++;
		} while (num != 0);
		 
	/*	int num = 0, i = 1;
		int total;
		do {
			System.out.println("보고싶은 구구단 ? ");
			num = System.in.read() - '0';
			System.in.read();
			System.in.read();
			if (num < 2) {
				System.out.println("구구단 숫자가 아닙니다.");
			} else {
				System.out.println("구구단 " + num + "단");
				do {
					total = num * i;
					System.out.println(num + " * " + i + " = " + total);
					i++;
				} while (i <= 9);
			}
		} while (num != 0);
		System.out.println("프로그램 종료");*/
	}

}

package ch03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 숫자의 자리수 합계를 구하시오
		// 376 => 3 + 7 + 6 => 16, 1145 = 1+1+4+5 => 11
		Scanner sc = new Scanner(System.in);
		System.out.println("자리수를 구하고 싶은 정수를 입력하세요");

		int sum = 0;
		int num = 0;
		num = sc.nextInt();
		while (num != 0) {
//			sum += num % 10;
			sum = sum + (num % 10); // 한 자리수마다 대입 후 합
			num = num / 10; // 몫이 0이 될때까지 반복
		}
		
		
		
		
//		substring으로 해보기
		System.out.println("합계 : " + sum);
		sc.close();
	}

}

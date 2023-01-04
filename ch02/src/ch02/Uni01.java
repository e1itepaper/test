package ch02;

public class Uni01 {

	public static void main(String[] args) {
		// %s 문자열, %d는 정수, %c는 문자					// 정수형식으로 변환 => 코드값
		System.out.printf("문자 %c의 유니코드는 %d\n", 'A', (int) 'A');
		System.out.printf("문자 %c의 유니코드는 %d\n", 'a', (int) 'a');
		System.out.printf("문자 %c의 유니코드는 %d\n", '0', (int) '0');
		System.out.printf("문자 %c의 유니코드는 %d\n", 'A' + 1, (int) ('A' + 1));

	}

}

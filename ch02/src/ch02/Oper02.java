package ch02;

public class Oper02 {

	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 5;
		int result = 2 * ++i1 + (3 - i2--) * 2;
		// i1, i2, result를 출력하고 결과가 왜그런지 설명
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("result = " + result);
		/*
		 * ++/--부호가 앞에 있으면 1을 증감한 후에 연산
		 * ++/--부호가 뒤에 있으면 연산한 후에 1 증감
		 * ++i1 = 6 ++가 앞에 있으면 증가하고 대입
		 * i2-- = 5 --가 뒤에 있으면 대입하고 1을 감소하기 때문에 값이 5 그대로
		 * result = 2*6+(3-5)*2 = 12 - 4 = 8
		 */

	}

}

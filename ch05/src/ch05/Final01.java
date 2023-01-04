package ch05;

public class Final01 {
	public static void main(String[] args) {
//		이것은 파이값
		final double PI = 3.14; // final은 변수 값 변경 불가, 못 바꾸게 하는 인식
//		PI = 3.141538;
		int r = 10;
		System.out.println("원의 면적 : " + r * r * PI);
	}
}

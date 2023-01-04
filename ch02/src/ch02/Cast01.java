package ch02;

public class Cast01 {

	public static void main(String[] args) {
		System.out.println('A');
		System.out.println((int) 'A'); // 정수형으로 형변환, A의 아스키 코드
		System.out.println(6.5);
		System.out.println((int) 6.5);
		System.out.println(3);
		System.out.println((float) 3);
		float f1 = 3.1f;
		float f2 = 3.1F;
		System.out.printf("%f,%f", f1, f2);

	}

}

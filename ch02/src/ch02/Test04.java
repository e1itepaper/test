package ch02;

public class Test04 {

	public static void main(String[] args) {
		char c1 = 'a';
//		문자는 연산자를 만나면 문자값이 연산을 할 수 잇는 아스키 코드의 int형으로 변경
//		정수를 char로 변경하기 위해서 명시적 형변환		
		char c2 = (char) (c1 + 1);
		System.out.println("c2 = " + c2);
//		현재 아스키코드의 1 증가한 아스키코드값	
		char c3 = ++c1;
		System.out.println("c3 = " + c3);
		int i1 = 'C' - 'A'; // 67 -65 => 2
		int i2 = '2' - '0'; // 50 -48 => 2
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
	}
}

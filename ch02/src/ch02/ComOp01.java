package ch02;

public class ComOp01 {

	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
		// 모든 연산자 중에 대입연산자(=)가 마지막에 실행된다.
		boolean b1 = i1 == i2;
		System.out.println("b1 = " + b1); // 같지 않다. false(거짓)
		// !=, >, >=, <, <= 결과를 b1에 대입하고 b1을 출력
		boolean b2 = i1 != i2;
		System.out.println("b2 = " + b2);
		boolean b3 = i1 >= i2;
		System.out.println("b3 = " + b3);
		boolean b4 = i1 > i2;
		System.out.println("b4 = " + b4);
		boolean b5 = i1 <= i2;
		System.out.println("b5 = " + b5);
		boolean b6 = i1 < i2;
		System.out.println("b6 = " + b6);

	}

}

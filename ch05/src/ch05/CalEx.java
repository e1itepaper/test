package ch05;

class Cal {
	int x, y; // 전역변수, 여러 메소드에서 같이 사용할 수 있따.

	void prn() {
//		지역변수 : 메소드안에서 선언된 변수
		System.out.printf("%d + %d =%d\n", x, y, x + y);
		System.out.printf("%d - %d =%d\n", x, y, x - y);
		System.out.printf("%d * %d =%d\n", x, y, x * y);
		System.out.printf("%d / %d =%d \n", x, y, x / y);
		System.out.println("=====================");
	}
}

public class CalEx {

//	main이 있는 클래스만 public 
	public static void main(String[] args) {
		Cal c1 = new Cal();
		c1.x =12; c1.y=3;
		c1.prn();
		
		Cal c2 = new Cal();
		c2.x =12; c2.y=3;
		c2.prn();

	}

}

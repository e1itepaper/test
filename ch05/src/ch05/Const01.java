package ch05;

public class Const01 { // 매개변수의 개수가 다르거나 데이터형이 달라야한다.
	public Const01() {
		System.out.println("매개 변수가 없는 생성자");
	}

	public Const01(int x) {
		System.out.println("매개 변수가 1개 x = " + x);
	}

	public Const01(int x, int y) {
		System.out.println("매개 변수가 2개 x = " + x + ", y = " + y);
	}

	public Const01(String name) {
		System.out.println("매개 변수가 문자 = " + name);
	}

	static void prn() {
		System.out.println("대박사건");
	}

	public static void main(String[] args) {
		prn();//static있으면 클래스명.메소드명();, 같은 클래스 내에서는 클래스명을 생략가능
		Const01 c1 = new Const01();
		c1.prn();//static 없으면 객체를 생성한 후에 실행
		Const01 c2 = new Const01(7);
		Const01 c3 = new Const01(7,7);
		Const01 c4 = new Const01("대박");
		
	}
}

package ch05;

public class InitBlock02 {
	static int i; // 변수 선언
	int j;
	{ // 인스턴스 초기화블럭, 객체를 생성할 때 마다 실행
		j = 10;
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	static { // 클래스 초기화 블럭, loading할때 실행
		i = 10;
		System.out.println("클래스 인스턴스 초기화 블럭 실행");
	}
	public static void main(String[] args) {
		InitBlock02 i1 = new InitBlock02();
		InitBlock02 i2 = new InitBlock02();
		InitBlock02 i3 = new InitBlock02();
	}
}

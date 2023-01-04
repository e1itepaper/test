package ch05;

class Card {
	static int width, height; // 클래스 변수, 정적 변수
	String kind; // 인스턴스 변수
	int number;

	void prn() {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("종류 : " + kind);
		System.out.println("번호 : " + number);
		System.out.println();
	}
}

public class CardEx {

	public static void main(String[] args) {
		Card.width = 50;
		Card.height = 80;

		Card c1 = new Card();
		c1.kind = "스페이드";
		c1.number = 7;
		c1.prn();
		
		Card c2 = new Card();
		c2.kind = "하트";
		c2.number = 10;
		c2.prn();
		
		Card c3 = new Card();
		c3.kind = "클로버";
		c3.number = 3;
		c3.prn();
	}

}

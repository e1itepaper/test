package ch05;
import pac.Cal02;//import : 다른 패키지의 클래스를 사용할 때
public class Box01Ex {

	public static void main(String[] args) {
		Box01 b1 = new Box01();
		Box01 b2 = new Box01();

		b1.width = 10;
		b1.height = 20;
		b1.area();

		b2.width = 15;
		b2.height = 15;
		b2.area();   
		
		Cal02 c2 = new Cal02();
	}

}

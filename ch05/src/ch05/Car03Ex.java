package ch05;

class Car03 {
	String color;
	int displacement;
	String kind;
// 	생성자가 하나라도 있으면 default 생성자는 만들어지지 않는다.
	public Car03(String c, int d, String k) {
		color = c;
		displacement = d;
		kind = k;
	}

	void prn() {

		System.out.println("색깔 : " + color);
		System.out.println("배기량 : " + displacement);
		System.out.println("종류 : " + kind);
		
		System.out.println();
	}
}

public class Car03Ex {

	public static void main(String[] args) {

		Car03 c1 = new Car03("blue", 1500, "벤츠");
		Car03 c2 = new Car03("red", 2000, "아우디");
		Car03 c3 = new Car03("yellow", 3000, "BMW");
		c1.prn();
		c2.prn();
		c3.prn();

	}

}

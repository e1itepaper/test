package ch05;

class Car02 {
	static String color; // 공유, 클래스 변수, loading할 때
	String kind; // 인스턴스 변수, 객체를 생성해야 사용가능
	int displacement = 2000; // default(기본)값

	void prn() {
		System.out.println("색깔 : " + color);
		System.out.println("종류 : " + kind);
		System.out.println("배기량 : " + displacement);
		System.out.println("=======================");
	}
}

public class Car02Ex {
	public static void main(String[] args) {
		Car02 myCar = new Car02();
		Car02 yourCar = new Car02();

		Car02.color = "red";// 클래스 변수는 객체를 생성하지 않고 클래스명.변수명으로 사용가능
		myCar.displacement = 1500;
		myCar.kind = "벤츠";
		myCar.prn();

		yourCar.color = "blue";
		yourCar.displacement=2000 ;
		yourCar.kind = "마세라티";
		yourCar.prn();
	}
}

package ch05;

public class Car01Ex {
	public static void main(String[] args) {
//		선언 : 클래스명 객체명(참조변수명, reference 변수명)
//						생성
		Car01 myCar = new Car01(); // 선언과 생성 동시에
//		멤버변수를 사용하는 것은 객체명.멤버변수명
		myCar.color = "red";
		myCar.displacement = 2000;
		myCar.name = "소나타";
//		객체명.메소드명();
		myCar.speedUp();
		myCar.stop();
		myCar.prn();

		Car01 yourCar = new Car01();
		yourCar.color = "blue";
		yourCar.displacement = 3500;
		yourCar.name = "그랜저";
		yourCar.speedUp();
		yourCar.stop();
		yourCar.prn();

		System.out.println("이름 : " + myCar.name);
	}
}

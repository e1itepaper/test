package ch05;

class Car04 {
	String kind, color;
	int displacement;

	public Car04(String kind, int disp, String color) {
		this.kind = kind;
		this.displacement = disp;
		this.color = color;
	}

	void prn() {
		System.out.println("===================");
		System.out.println("종류 : " + kind);
		System.out.println("배기량 : " + displacement);
		System.out.println("색깔 : " + color);
	}
}

public class Car04Ex {
	public static void main(String[] args) {
		Car04 car1 = new Car04("벤츠", 1500, "빨강");
		Car04 car2 = new Car04("BMW", 2000, "노랑");
		Car04 car3 = new Car04("아우디", 2500, "파랑");
//		car1.prn();
//		car2.prn();
//		car3.prn();

		Car04[] car = { car1, car2, car3 };
		
//		일반 for문
		for (int i = 0; i < car.length; i++) {
//			car[i].prn();
		}
		
//		확장 for문
		for(Car04 i : car){
			i.prn();
		}
	}
}

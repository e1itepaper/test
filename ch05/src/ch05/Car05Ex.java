package ch05;

class Car05 {
	String carNo;// 차량번호
	int inTime;// 입고시간
	int outTime;// 출고시간
	int fee;// 주차 요금
	final int MONEY_PER_HOUR = 5000; // final에서는 단어와 단어를 이을 때 언더바(_)사용

	public Car05(String carNo, int inTime, int outTime) {
		this.carNo = carNo;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	void calFee() {
		fee = (outTime - inTime) * MONEY_PER_HOUR;
	}

	void prn() {
		System.out.println("===============================");
		;
		System.out.println("차량번호 : " + carNo);
		System.out.println("입고시간 : " + inTime);
		System.out.println("출고시간 : " + outTime);
		System.out.println("주차요금 : " + fee);
	}
}

public class Car05Ex {
	public static void main(String[] args) {
		Car05 car1 = new Car05("가 1234", 11, 16);

		Car05 car2 = new Car05("아 4978", 9, 15);

		Car05 car3 = new Car05("다 1111", 10, 18);

		Car05[] car = { car1, car2, car3 };
		
//		for(int i=0; i<car.length;i++) {
//			car[i].calFee();
//			car[i].prn();
//		}
		
		for(Car05 c:car) {
			c.calFee();
			c.prn();
		}
	}
}

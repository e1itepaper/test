package ch05;

class Score01 { // default는 같은 패키지나 같은 클래스에서 사용가능
	String name;
	int kor, eng, math;

	static void title() { // 클래스 메소드, 정적, 객체를 생성하지 않고 클래스명.method()로 사용

		String em = " ";
		System.out.print(em + "이름\t국어\t" + em + "영어\t" + em + "수학\t" + em + "합계\t" + em + "평균\t");
		System.out.println("\n==============================================");
	}

	void prn() {
		int sum = kor + eng + math; // 지역변수 : 메소드안에서만 사용 가능
		float avg = (float) (kor + eng + math) / 3;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t", name, kor, eng, math, sum, avg);
		System.out.println();
	}
}

public class Score01Ex {

	public static void main(String[] args) {
		Score01 sc1 = new Score01();
		Score01.title();
		sc1.name = "유지민";
		sc1.kor = 78;
		sc1.eng = 89;
		sc1.math = 66;
		sc1.prn();

		Score01 sc2 = new Score01();
		sc2.name = "김민정";
		sc2.kor = 77;
		sc2.eng = 99;
		sc2.math = 44;
		sc2.prn();

		Score01 sc3 = new Score01();
		sc3.name = "박지성";
		sc3.kor = 45;
		sc3.eng = 67;
		sc3.math = 88;
		sc3.prn();

		Score01 sc4 = new Score01();
		sc4.name = "나재민";
		sc4.kor = 100;
		sc4.eng = 85;
		sc4.math = 86;
		sc4.prn();

	}

}

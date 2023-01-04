package ch05;

class Score02 { // default는 같은 패키지나 같은 클래스에서 사용가능
	String name;
	int kor, eng, math;

//	생성자 클래스명과 같음, 반환형이 없음, 매개변수의 개수가 다르거나 데이터형이 다르면 여러개 가능
	public Score02(String n, int k, int e, int m) {

		name = n;
		kor = k;
		eng = e;
		math = m;

	}
//		   반환형
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

public class Score02Ex {

	public static void main(String[] args) {
		Score02.title();
		Score02 sc1 = new Score02("유지민", 78, 89, 66);
		Score02 sc2 = new Score02("김민정", 77, 99, 44);
		Score02 sc3 = new Score02("박지성", 65, 67, 95);
		Score02 sc4 = new Score02("나재민", 100, 85, 86);
		sc1.prn();
		sc2.prn();
		sc3.prn();
		sc4.prn();

	}

}

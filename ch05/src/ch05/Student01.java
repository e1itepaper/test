package ch05;

public class Student01 {
	String name;
	int kor, eng, math;

	public Student01(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	static void title() {
		String em = " ";
		System.out.print(em + "이름\t국어\t영어\t수학\t합계\t평균\t");
		System.out.println("\n=============================================");
	}

	void prn() {
		int sum = kor + eng + math;
		float avg = (float) sum / 3;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", name, kor, eng, math, sum, avg);
	}

	public static void main(String[] args) {
		Student01.title();
		Student01 st1 = new Student01("유지민", 77, 88, 70);
		Student01 st2 = new Student01("김민정", 67, 98, 80);
		Student01 st3 = new Student01("박지성", 57, 65, 77);
		Student01 st4 = new Student01("나재민", 45, 60, 99);
		st1.prn();
		st2.prn();
		st3.prn();
		st4.prn();
	}
}

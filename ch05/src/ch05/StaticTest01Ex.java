package ch05;

class A1 {
	static int s1 = 0; // 사용자 모두에게 영향(변경된 값을 저장)
	int s2 = 0; // 본인 객체에만 영향

	void add() {
		s1++;
		s2++;
	}
}

public class StaticTest01Ex {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add();
		System.out.println("s1 : " + a1.s1 + ", s2 : " + a1.s2);
		
		A1 a2 = new A1();
		a2.add();
		System.out.println("s1 : " + a2.s1 + ", s2 : " + a2.s2);
		
		A1 a3 = new A1();
		a3.add();
		System.out.println("s1 : " + a3.s1 + ", s2 : " + a3.s2);
		
		A1 a4 = new A1();
		a4.add();
		System.out.println("s1 : " + a4.s1 + ", s2 : " + a4.s2);
	}

}

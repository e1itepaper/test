package ch02;

public class Area {

	public static void main(String[] args) {
		float pi = 3.141592f;
		double pi2 = 3.141592;
		int r = 5;
		System.out.println(pi);
		System.out.println(pi2);
		System.out.println("원의 둘레 : " + 2 * pi2 * r);
		System.out.println("원의 면적 : " + pi2 * r * r);
	}
}

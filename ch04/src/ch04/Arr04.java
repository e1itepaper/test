package ch04;

public class Arr04 {

	public static void main(String[] args) {
		int[] i1 = { 56, 78, 88, 92, 66 }; // 선언 생성 대입을 동시에
		int[] i3 = new int[] { 56, 78, 88, 92, 66 };
		int[] i2;
//		i2 = { 56, 78, 88, 92, 66 }; //에러
		i2 = new int[] { 66, 77, 88, 99 };
//		i1 일반 for
		for (int i = 0; i < i1.length; i++) {
			System.out.println(i1[i]);
		}
		System.out.println("=================");
//		i2 확장 for
		for(int i : i2) {
			System.out.println(i);
		}
	}
	

}

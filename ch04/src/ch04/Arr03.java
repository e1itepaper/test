package ch04;

public class Arr03 {

	public static void main(String[] args) {
//		정수 배열 5개 선언하고 1 ~ 10사이의 정수를 랜덤하게 대입한 후에
		int[] i1 = new int[5];
		for (int i = 0; i < i1.length; i++) {
			i1[i] = (int) (Math.random() * 10) + 1;
		}
//		일반 for
		for (int i = 0; i < i1.length; i++) {
			System.out.println("i1["+i+"] = "+i1[i]);
		}
		System.out.println("\n=====================================");
//		확장 for
		for (int i : i1) {
			System.out.print(i + "\t");
		}
	}

}

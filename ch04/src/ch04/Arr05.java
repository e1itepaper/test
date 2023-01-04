package ch04;

public class Arr05 {

	public static void main(String[] args) {
		String[] fruits = { "산딸기", "사과", "배", "대추", "메론", "샤인머스켓" };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("===============");
//		확장 for문으로 출력
		for(String s : fruits) {
			System.out.println(s);
		}
		System.out.println("===============");
//		순서를 뒤집어서 출력
		for (int i = fruits.length - 1; i >= 0; i--) {
			System.out.println(fruits[i]);
		}
	}

}

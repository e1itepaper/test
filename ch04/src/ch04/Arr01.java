package ch04;

public class Arr01 {

	public static void main(String[] args) {
//		int kim = 70, park = 88, choi = 92;
//		int[] score = { 70, 88, 92 };

		int[] score; // 배열선언 int score[]
//			0, 1, 2, 3, 4 : 총 5개, 숫자는 0으로 초기화
		score = new int[5]; // 배열 생성
//		int[] i1 = new int[3]; // 배열선언과 생성을 동시에
		int[] i1 = { 12, 67, 88 }; // 배열선언과 생성을 동시에 값 대입
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println("=======================");
//		배열명.length : 배열의 개수
		for (int i = 0; i < i1.length; i++) {
			System.out.println(i1[i]);
		}
		System.out.println("=======================");
		
//		확장(신) for : 데이터를 하나씩 옮겨서 실행, 더 이상 옮길 데이터가 없으면 종료
		for (int i : i1) { // for( 자료형 변수명 : 배열명)
			System.out.println(i); // 12 67 88 배열 값 모두 출력
		}
	}

}

package ch04;

import java.util.Arrays;

public class ArrCpy01 {

	public static void main(String[] args) {
		int[] arr1 = { 34, 67, 88, 77 };
		int[] arr2 = arr1; // arr1의 주소를 복사해서 대입한 것
		int[] arr3 = new int[arr1.length];
		int[] arr4 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) { // 값을 하나씩 전달
			arr3[i] = arr1[i];
		}
//						원본  시작  목표  시작 개수
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		arr1[1] = 125; // arr1만 변경
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

	}

}

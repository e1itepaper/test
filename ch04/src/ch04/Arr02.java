package ch04;

public class Arr02 {

	public static void main(String[] args) {
		float[] f1 = new float[3];
		f1[0] = 3.75f;
		f1[1] = 6.77f;
		f1[2] = 3.14f;
//		일반 for문으로 출력
		for(int f =0; f<f1.length;f++) { //정수는 0, 실수 0.0
			System.out.println(f1[f]);
		}
		System.out.println("==================");
//		확장 for문으로 출력
		for(float f  : f1) {
			System.out.println(f);
			
		}
		System.out.println("==================");
		String[] str = new String[5];
		for(String s :str) { // 초기값 문자(열) null
			System.out.println(s);
		}
 	}

}

package ch02;

public class Oper01 {

	public static void main(String[] args) {
		int i1 = 5;
		// ++가 앞에 있으면 1을 증가하고 값을 대입
		int i2 = ++i1; // ++ 1증가 i1=5, i2=6
		// ++가 뒤에 있으면 현재값을 대입한 후에 1을 증가
		int i3 = i1++; // ++ 1증가 i1=6, i3=6
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);

	}

}

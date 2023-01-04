package ch04;

public class ArrStr {

	public static void main(String[] args) {
		for (String ar : args) { // 문자(char)는 ''(작은따옴표), 문자열은 ""(큰따옴표)
			System.out.println(ar);
		}
		System.out.println("========================");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}

package ch02;

public class ByteCast01 {

	public static void main(String[] args) {
		//강제 형변환하면 프로그램에 에러가 없지만 실행하면 결과가 쓰레기가 될 수 있음
		byte b1 = (byte) 128; // -128 ~ 127
		System.out.println(b1); // -128
		
		byte b2 = (byte) 256;
		System.out.println(b2); // 0 
	}

}

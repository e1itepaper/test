package ch02;

public class Ex01 {

	public static void main(String[] args) {
		int numOfApples = 123; // numOfApples : 사과의 갯수
		// sizeOfBucket : 바구니의 크기(바구니에 담을 수 있는 사과의 갯수)
		int sizeOfBucket = 10;
		int numOfBucket = 
		(numOfApples % sizeOfBucket == 0) ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
		System.out.println(numOfBucket);

	}

}

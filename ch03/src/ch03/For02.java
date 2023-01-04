package ch03;

public class For02 {

	public static void main(String[] args) {
		int evenSum = 0, oddSum = 0;
		int a;
		for(a=1;a<101;a++) {
			if(a%2==0) {
				evenSum +=a;
			}else if(a%2==1) {
				oddSum +=a;
			}
		}
	}

}

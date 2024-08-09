package _03for;

public class test02p02 {

	public static void main(String[] args) {
		
		// 문제 1
		int oddSum = 0;
		for(int i = 100; i <= 999; i++) {
			if(i % 2 != 0 ) {
				oddSum += i;
			}
		}
				System.out.println(oddSum);
	}
}
package _04_Random;

import java.util.Random;

public class _02_Test {

	public static void main(String[] args) {
		Random r = new Random();
		int rNumber = r.nextInt(100)+1;
		System.out.println(rNumber);
		if(rNumber % 7 == 0) {
			System.out.println("행운의 숫자");
		} else {
			System.out.println("조심해야하는 숫자");
		}
	}

}

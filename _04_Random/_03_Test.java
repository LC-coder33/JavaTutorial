package _04_Random;

import java.util.Random;

public class _03_Test {

	public static void main(String[] args) {
		Random r = new Random();
		int rrNumber = 0;
		for(int i = 0; ; i++) {
			int rNumber = r.nextInt(100)+1;
			System.out.println(rNumber);
			if(rNumber % 7 != 0) {
			continue; } 
			else if(rNumber % 7 == 0){
				rrNumber += rNumber;
				break;
			}
	} System.out.println("행운의 숫자는: " + rrNumber);
	}

}

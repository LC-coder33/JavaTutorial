package _03for;

import java.util.Random;

public class handcodiing {

	public static void main(String[] args) {
		int sumAll = 0;
		
		for(int i =1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			sumAll += i;
		}
		System.out.println(sumAll);
		
		int[] lo = new int[6];
		Random r = new Random();
		r.nextInt(45);
		for( int i = 0; i < lo.length; i++) {
			lo[i]=r.nextInt(45);
			System.out.println(lo[i]);
		}
	}

}

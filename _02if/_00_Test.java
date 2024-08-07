package _02if;

public class _00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1
		double tAverage = 89.2;
		if(tAverage >=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 문제 2
		int level = 2;
		int point = 30;
		if(level == 1) {
			point += 30;
					} else {
						point += 10;
					}
		System.out.println("최종 포인트: " + point);
		
		// 문제 3
		int[] lotto = {6, 12, 33, 4, 5, 26};
		lotto[2] +=80;
		System.out.println(lotto[2]);
		
		// 문제 4
		lotto[2] = 33;
		
		if(lotto[3] % 2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		// 문제 5
		int sum = 0;
		if(lotto[0]%2 == 1) {
			sum += lotto[0];}
		if(lotto[1]%2 == 1) {
			sum += lotto[1];}
		if(lotto[2]%2 == 1) {
			sum += lotto[2];}
		if(lotto[3]%2 == 1) {
			sum += lotto[3];}
		if(lotto[4]%2 == 1) {
			sum += lotto[4];}
		if(lotto[5]%2 == 1) {
			sum += lotto[5];}
		System.out.println(sum);
		
		// 문제 6
		int[] b= { 45, 34, 64, 45, 24};
		System.out.println(b[0] + b[1] + b[2] + b[3] + b[4]);
		
		// 문제 7
		int[] a = {45, 34, 64};
		int fDigit0 = a[0] /10;
		int sDigit0 = a[0] % 10;
		int fNumber = fDigit0 + sDigit0;
		
		int fDigit1 = a[1] /10;
		int sDigit1 = a[1] % 10;
		int sNumber = fDigit1 + sDigit1;
		
		int fDigit2 = a[2] /10;
		int sDigit2 = a[2] % 10;
		int tNumber = fDigit2 + sDigit2;
		
		if(fNumber > sNumber && fNumber > tNumber) {
			System.out.println(a[0]);
		} else if(sNumber > tNumber && sNumber > fNumber) {
			System.out.println(a[1]);
		} else if(tNumber > sNumber && tNumber > fNumber) {
				System.out.println(a[2]);
		}
		
		// 문제 8
		int[] x = {6, 5, 9};
		int[] y = {4, 10, 6};
		int xBullet = 3;
		int yBullet = 2;
		if(x[0] % xBullet == 0 && y[0] % yBullet == 0) {
			System.out.println("0번 새");
		}
		if(x[1] % xBullet == 0 && y[1] % yBullet == 0) {
			System.out.println("1번 새");
		}
		if(x[2] % xBullet == 0 && y[2] % yBullet == 0) {
			System.out.println("2번 새");
		}
		
		// 문제 9
		int enemyx = 10; 
		int enemyy = 20; 
		int mx = 11; 
		int my = 20; 
		
		if ((enemyx <= mx && enemyx+5 >= mx+2) && 
				(enemyy <= my && enemyy+6 >= my+2)) {
			System.out.println("Hit");
		} else {
			System.out.println("Not Hit");
		}
	}
}

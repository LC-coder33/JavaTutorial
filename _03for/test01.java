package _03for;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("문제 1");
		int oddSum = 0;						// 홀수의 합 초기 값
		int evenSum = 0;					// 짝수의 합 초기 값
		int oddCnt = 0;						// 홀수의 갯수 초기 값
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 0) {				
				evenSum += i;				// 짝수의 합
			} else {
				oddSum += i;				// 홀수의 합
				oddCnt ++;					// 홀수의 갯수
			}
		}
		System.out.println(oddSum - evenSum);	// 홀수의 합 - 짝수의 합
		
	System.out.println("문제 2");
		System.out.println(oddSum);				// 홀수의 합
		System.out.println(evenSum);			// 짝수의 합
		
	System.out.println("문제 3");
		System.out.println(oddCnt);				// 홀수의 갯수
		
	System.out.println("문제 4");	
		int allNumber = 0;						// 100 ~ 999 합의 초기 값
		for(int i = 100; i <= 999; i++) {
			allNumber += i;						// 100 ~ 999 까지의 합
			}
		System.out.println((allNumber/100000) + (allNumber/10000) % 10 + 
				(allNumber/1000)%10	+ (allNumber/100)%10 + (allNumber/10)%10);
		// 100 ~ 999 까지의 숫자의 합의 100의 자리, 10의 자리 1의 자리의 합
		
	System.out.println("문제 5");
		for(int i = 100; i <=999; i++) {
			if(((i/10) % 10) % 3 == 0 && ((i%100)/10)!=0) {
													// 100에서 999 중 십의 자리가 3의 배수
				System.out.print(i + " ");			// 의 반복적인 나열
			}
		}
	System.out.println("문제 6");
		int accumulated = 0;					// 0 부터 100까지의 합 초기 값
		int countN = 0;							// 0 부터 100까지 더하는 횟수 값
		for(int i = 0; i <= 100; i++) {
			accumulated += i;
			if(accumulated < 44) {
			countN ++;
			}
		}
		System.out.println(countN);				// 9번째 횟수 때 44가 넘어감
	
	System.out.println("문제 7");
	int sumAll = 0;
	for(int i = 0; i <=10; i++) {
		sumAll += i;
		System.out.print(i + "+");				// 줄이 바뀌지 않는 숫자들
	}
	System.out.println(sumAll);					// 결과 값
	
	System.out.println("문제 8");
		int fib = 1;
		int aFib = 0;
		int pFib = 0;
		int fibSum = 0;
		for(int i = 1; i < 8; i++) {
			System.out.print(fib);
			if(i != 7) {
			System.out.print("+");
			}
			fibSum += fib;
			aFib = fib + pFib;
			pFib = fib;
			fib = aFib;
		}
		System.out.println("=" + fibSum);
	
	System.out.println("문제 9");
		int fibA = 0;
		int fibP = 0;
		for(int i = 1; i < 20; ) {
			System.out.print(i + " ");
			fibA = i + fibP;
			fibP = i;
			i = fibA;
		}
		
		/*
		 * int temp = 0; 				임시 저장 값
		 *sysout(i);					현재 피보나치 수 출력
		 *int temp = i;					임시 저장 값에 현재 피보나치 수 저장
		 *i = bint + i;					현재 피보나치 수를 이후 값으로 만듦
		 *fibP = temp;					이전 피보나치 수를 이후 값이 되기 전 현 피보나치 수로 바꿔줌
		 */
		
	System.out.println("");
	System.out.println("문제 10");
	int sumofNumber = 0;
	for(int i = 100000000; i >=1; i /= 10) {
		System.out.print((987654321/i) % 10);
		if(i!=1) {
			System.out.print("+");
		}
		sumofNumber += (987654321/i % 10);
	}
	System.out.println("=" + sumofNumber);

	 /* int a = 987654321;
	 int sum = 0;
	 for ( ; a > 0 ; ) {
	 sum +=(sum%10);
	 a/=10;
	 }
	 System.out.println(sum); */
	}
}

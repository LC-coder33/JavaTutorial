package _03for;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {30, 40, 50, 55, 65};
		
		/* for(int i = 4; i >= 0 ; i--) {
			System.out.println(a[i]);
		} */
		/* for (int i = 0; i <= 4; i++) {
		    System.out.println(a[(i+1)%5]);		// %를 중요하게 생각할 것
		} */
		/* for(int i = 0; i  < 5; i++) {			// 배열 순회를 반복하면서 값의 조건판단 후 출력
			if(a[i] >= 50) {
				System.out.println(a[i]);
			}
		} */
		
		int sum = 0;
		int count = 0;
		int minValue = 10000;
		/* for(int i = 0; i < 5; i++) {
			if(a[i] >= 50) {
				sum += a[i];
				count ++;
			}
		}*/
		//System.out.println("문제 1: " + sum);
		//System.out.println("문제 2: " + (double)sum/count);
		for(int i = 0; i < 5; i++) {
			if(minValue > a[i]) {
				minValue = a[i];
			}
			if(minValue != a[i]) {
				sum+=a[i];
				count ++;
			}
		}

		System.out.println(minValue);
		System.out.println((double)sum/count);
	}
}

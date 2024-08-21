package _06_2ForEx;

public class _03_Test {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 1;
		
		for(int i = 1; i <= 10; i++) {
			temp = 1;
			for(int j = i; j >= 1; j--) {
				temp *= j;
			}
			System.out.println(i+"일 때 팩토리얼 : " + temp);
			sum += temp;
		}
		System.out.println("팩토리얼 총합 : " + sum);
	}

}

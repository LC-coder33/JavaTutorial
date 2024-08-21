package _06_2ForEx;

public class _01_Test {

	public static void main(String[] args) {
		int[] arr = {3,45,26,50,74};
		int a = 5;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % a == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}

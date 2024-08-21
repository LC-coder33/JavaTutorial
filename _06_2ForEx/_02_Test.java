package _06_2ForEx;

public class _02_Test {

	public static void main(String[] args) {
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println((double)sum/(arr.length));
	}

}

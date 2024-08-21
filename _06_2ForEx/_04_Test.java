package _06_2ForEx;

public class _04_Test {

	public static void main(String[] args) {
		int[] b = {93,45,83,58,75,56};
		int hIndex = 0;
		for(int i = 0; i < b.length; i++) {
			hIndex = 0;
			for(int j = 0; j < b.length - i; j++) {
				if(b[hIndex] < b[j] ) {
					hIndex = j;
				}
			}
			int temp = b[b.length - 1 - i];
			b[b.length-1-i]=b[hIndex];
			b[hIndex]=temp;
			
			for(int k = 0; k < b.length; k++) {
				System.out.print(b[k] + " ");
			}
			System.out.println();
		}
	}

}

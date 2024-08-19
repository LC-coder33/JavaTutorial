package _05_2For;

public class _06_Test {

	public static void main(String[] args) {
		int[] a = {34,55,23,56,34,45,34};
		int[] b = {36,49};
		int ts = 0;
		int fn = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0 && a[i] > b[0]) {
					ts++;
				} else if(j == 1 && a[i] > b[1]) {
					fn++;
				}
			}
		}
		System.out.println("36보다 큰 숫자는 " + ts + "개 있다.");
		System.out.println("49보다 큰 숫자는 " + fn + "개 있다.");
	}

}

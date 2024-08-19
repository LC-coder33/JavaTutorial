package _05_2For;

public class _04_Test {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 7; i >= 0; i -= 2) {
			cnt++;
			for(int j = 0; j < cnt-1; j++) {
				System.out.print("0");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

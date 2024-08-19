package _05_2For;

public class _05_Test {

	public static void main(String[] args) {
		int[] a = {34,55,23,56,34,45,34};
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i]>40) {
				cnt++;
			}
		}
		System.out.println(cnt + "개");
	}

}

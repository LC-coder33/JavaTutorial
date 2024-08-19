package _05_2For;

public class _08_Test {

	public static void main(String[] args) {
		int[] pang = {1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int cnt = 0;
		for(int i = 0; i < pang.length; i++) {
			for(int j = 1; j <pang.length; j++) {
				if(pang[i] == pang[j] ) {
					cnt++;
				} else {
					cnt = 0;
				}
			}
		}
	}

}

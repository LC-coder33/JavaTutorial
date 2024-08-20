package _05_2For;

public class _10_Test {

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2;
		int maxCnt = 0;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			cnt = 0;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] == 0) {
					cnt++;
				} else {
					break;
				}
			}
				if(cnt >= size) {
					maxCnt += (cnt - size + 1);
					i += cnt - 1;
			}
		}
		System.out.println(maxCnt + "개");
	}

}

package _03for;

public class test02p08 {
	public static void main(String[] args) {
	int[] arr = {45, 23, 25, 64, 3, 24, 48};
	int arrCnt = 0;
	for(int i = 0; i < 7; i++) {
		if(arr[i] % 2 == 0) {
			arrCnt++;
		}
	}
	System.out.println(arrCnt + "개");
	}
}

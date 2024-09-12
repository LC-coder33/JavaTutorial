package _07_2dArray2;

public class _test06 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int num = 1;
		
		
		
		// 배열 값 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

package _07_2dArray2;

public class _test7 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int[][] b = a;
				for(int i = 0; i <b.length; i++) {
			for(int j = 0; j<b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}

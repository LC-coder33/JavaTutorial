package _07_2dArray2;

public class _test04 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		/* 00 = 0
		 * 01 10 = 1
		 * 02 11 20 = 2
		 * 03 12 21 30 = 3
		 * 04 13 22 31 = 4 
		 * 14 23 32 = 5
		 * 24 33 = 6
		 * 34 = 7
		 * 
		 */
		
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
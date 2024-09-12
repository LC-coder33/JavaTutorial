package _07_2dArray2;

public class _test01 {

	public static void main(String[] args) {
		/*03 04
		 *13 14
		 *23 24
		 *33 34
		 */
		
		int[][] a = new int[4][5];
		int num = 1;
		int sRow = a.length;
		int sCol = a[0].length;
		
		for(int i = sCol-1; i>=0; i--) {
			for(int j = 0; j < sRow; j++) {
				a[j][i] = num;
				num++;
				}
		}
		
		
		
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

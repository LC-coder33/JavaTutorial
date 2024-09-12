package _07_2dArray2;

public class _test02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;
		
		for(int i = row - 1; i >= 0; i--) {
			for(int j = col - 1; j >= 0; j--) {
				a[i][j] = num;
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
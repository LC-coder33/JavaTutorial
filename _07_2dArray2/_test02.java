package _07_2dArray2;

public class _test02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		int addNum = 20;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j]= num + addNum - 1;
				addNum -= 1;
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
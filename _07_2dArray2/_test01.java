package _07_2dArray2;

public class _test01 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		int addNum = 16;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j]= num+ addNum;
				addNum -= 4;
			}
			addNum = 16;
			num += 1;
		}
		
		
		
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

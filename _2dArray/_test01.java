package _2dArray;

public class _test01 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i = 1; i <2;i++) {
			for(int j = 0; j <a[0].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
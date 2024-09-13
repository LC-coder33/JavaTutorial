package _07_2dArray2;

public class _test02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;
		
		// 행열 모두 최대값으로 고정한 뒤 시작해서 하나씩 줄여나간다.
		// 그러면 최대행의 최대열부터 줄여나가면서 num이 저장되고 num++로 인해 하나하나 줄어갈수록 num은 1씩 늘어난다.
		
		for(int i = row - 1; i >= 0; i--) {
			for(int j = col - 1; j >= 0; j--) {
				a[i][j] = num++;
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
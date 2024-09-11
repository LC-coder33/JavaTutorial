package _07_2dArray2;

public class _tetris02 {

	public static void main(String[] args) {
		int[][] tempArr = {{1,1,0},{0,1,0},{0,1,0}};
		int[][] nowblock = new int[3][3];
		
		/* 0 1 2
		 * 0 1 2
		 * 0 1 2 는 왼 쪽으로 회전한다면,
		 * 
		 * 2 2 2
		 * 1 1 1
		 * 0 0 0
		 * 
		 * 2 1 0
		 * 2 1 0
		 * 2 1 0
		 * 
		 * 0 0 0
		 * 1 1 1
		 * 2 2 2
		 * 
		 * 즉, 현 0행은 2열로 대체되게 만들면 된다.
		 * [0][0] = [0][2]
		 * [0][1] = [1][2]
		 * [0][2] = [2][2]
		 */
		int arrlength = tempArr.length;
		
		// 현 tempArr의 배열 상황
		for(int i = 0; i < arrlength; i++) {
			for( int j = 0; j < arrlength; j++) {
				System.out.print(tempArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = arrlength - 1; i >= 0; i--) {
			for( int j = 0; j < arrlength; j++) {
				System.out.print(tempArr[j][i] + " ");
			}
			System.out.println();
		}
	}
}

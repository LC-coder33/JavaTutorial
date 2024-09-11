package _07_2dArray2;

public class _tetris01 {

	public static void main(String[] args) {
		int[][] tempArr = {{1,1,0},{0,1,0},{0,1,0}};
		int[][] nowblock = new int[3][3];
		
		/* 0 1 2
		 * 0 1 2
		 * 0 1 2 는 오른 쪽으로 회전한다면,
		 * 
		 * 0 0 0
		 * 1 1 1
		 * 2 2 2 가 된다.
		 * 또 돌면,
		 * 
		 * 2 1 0
		 * 2 1 0
		 * 2 1 0
		 * 이후,
		 * 
		 * 2 2 2
		 * 1 1 1
		 * 0 0 0
		 * 
		 * [0][0] = [2][0]
		 * [0][1] = [1][0]
		 * [0][2] = [0][0]
		 * 즉, 현 0행은 0열로 대체되게 만들면 된다.
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
		for(int i = 0; i < arrlength; i++) {
			for( int j = arrlength - 1; j >= 0; j--) {
				System.out.print(tempArr[j][i] + " ");
			}
			System.out.println();
		}
	}
}

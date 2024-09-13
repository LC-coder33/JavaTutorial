package _07_2dArray2;

public class _test01 {

	public static void main(String[] args) {
		/*03 04	행이 변하고 열이 고정되어야하기 때문에 가장 먼저 움직이는 i를 열자리에 두고 i가 3번 음직일 동안 고정되어있는 j를 행의 자리에 넣는다.
		 *13 14	a배열의 j행의 i열에 num++를 해 1을 넣고 바로 num을 2로 만들어준다. 이를 행*열의 수만큼 반복한다.
		 *23 24
		 *33 34
		 */
		
		int[][] a = new int[4][5];
		int num = 1;
		int sRow = a.length;
		int sCol = a[0].length;
		
		for(int i = sCol-1; i>=0; i--) {
			for(int j = 0; j < sRow; j++) {
				a[j][i] = num++;
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

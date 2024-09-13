package _07_2dArray2;

public class _test03 {

	public static void main(String[] args) {

		int[][] a = new int[4][5];
		int num = 1;
		// 행이 0 2 4 와같은 짝수일 때 or 2로 나누면 나머지가 0일 때는 num이 열의 순서대로 입력지만
		// 행이 홀수 일 때는 num은 열의 역순으로 입력된다.
		// 짝수일 때는 최소값에서 최대값으로 열이 진행, 홀수일 때는 변수를 열의 최대값으로 준 뒤 하나한 뺀다. 짝수는 test00, 홀수는 test 02 와 동일하다
		
		for(int i=0; i<a.length; i++) {
			if(i % 2 == 0) {
				for(int j=0 ; j<a[0].length; j++) {
					a[i][j] = num;
					num++;
				}
			}else {
				for(int j=a[0].length -1 ; j>=0; j--) {
					 a[i][j] = num;
					 num++;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}

package _07_2dArray2;

public class _test04 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		/* 00 = 0
		 * 01 10 = 1
		 * 02 11 20 = 2
		 * 03 12 21 30 = 3
		 * 04 13 22 31 = 4 
		 * 14 23 32 = 5
		 * 24 33 = 6
		 * 34 = 7
		 * 
		 */
			int rowA=a.length;
			int colA=a[0].length;
			
			for(int k = 0; k < rowA + colA - 1; k++) { // 0~7까지 총 8번 반복하도록 한다
				for(int i = 0; i < rowA ; i++) {
					for(int j = 0; j < colA; j++) {
						if(i + j == k) {	// 0 일 때 00 1 일 떄 01 10 ... 의 열들이... 
							a[i][j] = num;	// 입력 된다
							num++;	// 각 행들을 지날 때 마다 1이 더해진다
						}
					}
				}
			}
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0;j < a[0].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}


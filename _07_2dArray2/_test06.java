package _07_2dArray2;

public class _test06 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int num = 1;
		int maxr = a.length - 1;	// 4
		int minr = 0;
		int maxc = a[0].length - 1;	// 4
		int minc = 0;
		int direction = 1;
		int minvalue = 0;	// direction 1 의 b[0][j]를 위해 만든 0의 자리를 위한 변수
		
		int[][] b = new int[a.length][a.length];
		
		// {{6,1,2,3,4},{11,12,7,8,5},{16,17,13,9,10},{21,18,19,14,15},{22,23,24,25,20}};
		
		/* 바깥 쪽:  시계 방향으로 한 칸 씩 돈다
		 * 안 쪽: 시계 방향으로 한 칸 씩 돈다.
		 * 가장 가운데는 그대로
		 */
		
		while(num < a.length*a[0].length) {
			if(direction == 1) {
				b[minc][minr] = a[minc][minr];	//b[0][0] = a[0][0]: 1;	b[1][1] = a[1][1]: 12
				for(int j = minc+1; j <= maxc; j++) {	// j = 1 / j <= 4 - 0 즉, 4 
					b[minc][j] = a[minc][j-1];	//b[0][1] = 1;
					num++;				//b[0][2] = 2;b[0][3] = 3;b[0][4] = 4;
					
				}
				minr++;		// minr = 1;
				direction = 2;
			} else if(direction == 2) {
				for(int j = minr; j <= maxr; j++) {	// j = 1, maxr = 4 즉, 1~4까지 돈다
					b[j][maxr] = a[j-1][maxr];		// b[1][4] = a[0][4] = 5
					num++;
				}
				maxc--;		// maxc = 3;
				direction = 3;
				} else if(direction == 3) {
					for(int j = minc; j < maxc ; j++) {	// j = 0 / 0 < 4 즉, 0 1 2 3 까지 총 4번 
						b[maxr][j] = a[maxr][j+1];
						num++;
					}
					maxr--;		// maxr = 4;
					direction = 4;
				} else if(direction == 4) {
					for(int j = maxr; j >= minr; j--) {
						b[j][minc] = a[j+1][minc];
						num++;
					}
					minc++;
					direction = 1;
				}
		}
		for(int i = 0; i <b.length; i++) {
			for(int j = 0; j<b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}

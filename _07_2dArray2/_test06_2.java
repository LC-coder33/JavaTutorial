package _07_2dArray2;

public class _test06_2 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}; // [5][5]의 배열
		int num = 1;
		int maxr = a.length - 1;	// 4
		int minr = 0;
		int maxc = a[0].length - 1;		// 4
		int minc = 0;
		int direction = 1;
		int temp = 0;		// 임시2를 받아서 현 자리에 넣을 임시 변수
		int temp2 = 0;		// 바뀔 자리에 존재하는 수를 저장할 임시 변수
		
		// 계속해서 임시 변수에 현 숫자를 번갈아가면서 저장하며 j가 바뀔 때 마다 수를 반복적으로 바꾸었다. 
		// 임시 숫자 변수를 만들어 임시 숫자2를 받고, 현 자리에 있는 수를 임시2로 저장하고
		// 임시 1은 그 임시 2 숫자를 받아서 원래의 수를 가지고 가는 방법을 계속해서 반복하였다.
				
		while(num <= a.length*a[0].length) {
			if (direction == 1) { // 오른쪽
                for (int j = minc; j <= maxc; j++) {
                	temp = temp2;  // 1
                	temp2 = a[minr][j];
                    a[minr][j] = temp;	// a[0][1] = a[0][0]: 1
                    num++;
                }
                minr++; // minr = 1;
                direction = 2;
				} else if(direction == 2) {
					for (int j = minr; j <= maxr; j++) {
						temp = temp2;
						temp2 = a[j][maxc];
	                    a[j][maxc] = temp;
	                    num++;
	                }
						maxc--; // maxc = 3;
						direction = 3;
					} else if(direction == 3) {
						for (int j = maxc; j >= minc; j--) {
							temp = temp2;
							temp2 = a[maxr][j];
		                    a[maxr][j] = temp;
		                    num++;
		                }
		                maxr--; // maxr = 3
		                direction = 4;
					} else if(direction == 4 ) {
						for (int j = maxr; j >= minr - 1; j--) {		
							temp = temp2;								
							temp2 = a[j][minc];		
		                    a[j][minc] = temp;
		                    num++;
		                }
		                minc++; // minc = 1;
		                direction = 1;
					}
 		}
		
		
		
				for(int i = 0; i <a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

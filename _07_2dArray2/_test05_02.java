package _07_2dArray2;

public class _test05_02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;		

		//변수4개 만들기
		int 행최소값=0;
		int 행최대값=3;
		int 열최소값=0;
		int 열최대값=4;		
		
		for(int j=0; j<2; j++) {
			// 맨 위에 부분 숫자 채우기
			// 맨 위는 행최소값 0  열최소값 0 열최대값 4
			// 맨 위(두번째는 행최소값 1  열최소값 1열최대값 3)
			for(int i=열최소값; i <= 열최대값; i++) {
				a[행최소값][i]=num++;
			}
			//위 반복문이 완료되었다면 0번행은 채울 필요없다.
			//행의 최소값을 증가시켜 버리다.
			행최소값++;
			for(int i=행최소값; i <= 행최대값; i++) {
				a[i][열최대값]=num++;
			}
			열최대값--;
			for(int i=열최대값; i>=열최소값; i--) {
				a[행최대값][i]=num++;
			}
			행최대값--;  // 행  1 2  열은 0  3
			for(int i=행최대값; i>=행최소값; i--) {
				a[i][열최소값]=num++;
			}
			열최소값++;  //행  1 2  열은 1  3
		}
		
		// 2차원 배열 a의 값을 0번행부터 모두 출력
		for(int i=0; i<4; i++) {
			//System.out.println(">행"+행);
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
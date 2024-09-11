package _07_2dArray;

public class _test02 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i = 2; i <3;i++) {
			for(int j = 0; j <a[0].length;j++) {
				// for(int i=0; i<5; i++) {
				// if(a[2][i]%2==0) {		이렇게 쓰는 것이 더 간편하다
				if(a[i][j] % 2 == 0) {
					System.out.print(a[i][j]+" ");
				}
						
			}
			System.out.println();
		}

	}

}
// 3행만 선별 -> %2 를 통해 짝수만 선별 후 출력
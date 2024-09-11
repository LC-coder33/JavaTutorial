package _07_2dArray;

public class _test03 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i = 0; i <a.length; i++) {
			for(int j = 2; j <3; j++) {
				System.out.print(a[i][j]+" ");
			}
			//for(int i=0; i < 5; i++) {
			//System.out.println(a[i][2]); 더 간편한 코드
			System.out.print("");
		}

	}

}
// 2열은 고정시키되 행은 0부터 4까지
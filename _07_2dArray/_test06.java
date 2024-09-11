package _07_2dArray;

public class _test06 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i = a.length-1; i >=0; i--) {
			for(int j = a[0].length-1; j >= 0;j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
// i 및 j를 배열의 최대값인 a.length, a[0].length 로 정한 뒤 --를 통해 최대값부터 0까지 내림차순으로 수를
// 내린다. 그러면 현재 보이는 배열의 역순으로 배열 내의 수가 출력된다.
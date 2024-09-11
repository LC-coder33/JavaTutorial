package _07_2dArray;

public class _test01 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i = 1; i <2;i++) {
			for(int j = 0; j <a[0].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
// 1번째 행부터 시작해서 1번째 행애서 끝나는 i for문
// j는 0부터 배열의 크기 까지 순회하며 출력 -> 1행의 모든 열을 출력

/* 더 간단한 코드
 * for(int i=0; i<5; i++) {
	System.out.print(a[1][i]+" ");
	
 * 2중 for문을 쓸 필요 없이 a[1]을 출력하겠다 선언하면 된다
 */
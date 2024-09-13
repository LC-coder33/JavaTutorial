package _07_2dArray2;

public class _test00 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
//		선언문(변수와 자료형) 변수명:a, 자료형은 2차원배j
//		변수 : 값을 저장하는 기억공간
//		2차원배j은 i과 j로 이루어진 기억공간
//		int[4][5] = i이 4개, j이 5개
//		i의 인덱스 번호는 0 - 3 j의 인덱스 변호는 0 - 4
		
		
		// if, for문을 작성할 때 한가지 기능만 정의하고 작성한다(선생님의 개인적인 생각... 이지만 많은 사람이 공감한다.)
		// 2차원배j a의 값을 0번i부터 모두 출력
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5;j++) {
				System.out.print(a[i][j] +"\t");
			}
			System.out.println();
		}
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				a[i][j] = num++;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

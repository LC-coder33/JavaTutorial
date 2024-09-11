package _07_2dArray;

public class _test05 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				if(a[i][j] % 2 != 0) {
					System.out.print((a[i][j] = 0) + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println(" ");
		}
	}

}
// 홀수는 0으로 마스킹하여 출력한다. 짝수와 동일하게 진행하되 만약 홀수로 판별되면 해당 좌표의 수는 =0이라는 식을 통해
// 마스킹한다.
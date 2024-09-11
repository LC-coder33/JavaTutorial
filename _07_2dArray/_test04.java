package _07_2dArray;

public class _test04 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},{6,7,8,9,10},
				{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int eCnt = 0;
		for(int i = 0; i <a.length;i++) {
			for(int j = 0; j <a[0].length;j++) {
				
				if(a[i][j] % 2 == 0) {
					eCnt++;
				}
						
			}
		}
		System.out.println(eCnt);
	}

}
// 순회하며 검색되는 값을 모두 % 2를 하여 짝수인지 판별. 만약 짝수라면 eCnt를 1씩 올린다. 결국 모든 배열의 총 
// 짝수의 수가 eCnt에 저장된다.
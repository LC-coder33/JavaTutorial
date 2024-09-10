package _2dArray;

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

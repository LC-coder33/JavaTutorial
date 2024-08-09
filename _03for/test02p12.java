package _03for;

public class test02p12 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int cCnt = 0;
		int mCnt = 0;
		for(int i = 0; i < arr.length; i++) {
		if(arr[i] == 0) {
			cCnt++;
			} else {
				cCnt = 0;
			} if(cCnt > mCnt) {
				mCnt = cCnt;
		}
		}
		System.out.println("터널의 길이는 " + mCnt);
	}

}

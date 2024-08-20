package _05_2For;

public class _08_Test {

	public static void main(String[] args) {
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int nowNumber=pang[0];
		int cnt=0;
		for(int i=0; i < pang.length; i++) {
			nowNumber=pang[i];
			cnt=0;
			for(int j=i; j < pang.length; j++) {
				if(nowNumber == pang[j]) {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt >= 3) {
				System.out.println(i+"위치의 캐릭터 "+nowNumber+"는 오른쪽으로 "+cnt+"개 연속입니다");
				i += cnt-1;
			}
		}
	}

}

package _03for;

public class test02p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 14");
		String ttt="aabbbcccaaaaddbbbaaaaa";		// 1. 문자열의 문자를 가져온다
													// 문자를 첫번째부터 하나씩 가져온다.
		int currentCount = 0;
		int maximumCount = 0;
		int stunnelNumber = ttt.charAt(0);
		char tttNumber = 0;
		for(int i = 0; i < ttt.length(); i++) {
			if(ttt.charAt(i) == stunnelNumber) {
				currentCount++;
			} else {
				stunnelNumber=ttt.charAt(i + 1);
				currentCount = 0;
			} if(currentCount > maximumCount) {
				maximumCount = currentCount;
				tttNumber = ttt.charAt(i);
			}
		}
		System.out.println("터널의 길이: " + maximumCount);
		System.out.println("가장 긴 터널의 이름은 " + tttNumber + "터널이다.");
	}

}

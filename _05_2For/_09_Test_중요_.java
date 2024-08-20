package _05_2For;

public class _09_Test_중요_ {

	public static void main(String[] args) {
		String ttt="aabbbcccaaaaddbbbaaaaa";
		int maxCnt = 0;
		int cnt = 0;
		char maxChar = '0';
		char nowChar = '0';
		// 1. a중에 가장 긴 a? i=는 a문자열의 index
		// 밑의 코드는 정말 많이 쓰여지는 코드이다!!!!!!!!!!
		for(int i = 0; i < ttt.length();i++) {
			cnt = 0;
			nowChar = ttt.charAt(i);
				for(int j = i; j < ttt.length();j++) {
					if(ttt.charAt(j) != nowChar) {
						break;
					} else {
						cnt++;
					}
					if(cnt > maxCnt) {
						maxCnt = cnt;
						maxChar = nowChar;
					}
				}
				i = i + cnt - 1;
			}
		System.out.println("가장 긴 터널의 알파벳은 " + maxChar);
		System.out.println("가장 긴 터널의 길이는 " + maxCnt);
	}

}

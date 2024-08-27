package test03;

public class networkString {

	public static void main(String[] args) {
		String a = "aabbccddeeeaaaa";
		int maxCnt = 0;
		int sCnt = 0;
		char maxChar = '0';
		char nowChar = '0';
		for(int i = 0; i < a.length();i++) {
			sCnt = 0;
				nowChar = a.charAt(i);
				for(int j = i; j < a.length(); j++) {
					if(a.charAt(j) != nowChar) {
						break;
					} else {
						sCnt++;
						}
					if(sCnt > maxCnt) {
						maxCnt = sCnt;
						maxChar = nowChar;
					}
				}
				i = i + sCnt - 1;
		}
		System.out.println("최대 길이는 " + maxCnt);
		System.out.println("해당 문자는 " + maxChar);
	}

}

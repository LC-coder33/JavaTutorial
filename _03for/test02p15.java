package _03for;

public class test02p15 {

	public static void main(String[] args) {
		System.out.println("문제 14");
		String ttt="aabbbcccaaaaddbbbaaaaa";
		int currentCount = 0; String resultZip = "";
		int maximumCount = 0;
		char stunnelNumber = ttt.charAt(0);
		int tttNumber = 0;
		for(int i = 0; i < ttt.length(); i++) {
			if(stunnelNumber == ttt.charAt(i)) {
				currentCount++;
			} else {
				resultZip = resultZip + stunnelNumber + currentCount;
				stunnelNumber=ttt.charAt(i);
				currentCount = 1;
			}	if(currentCount > maximumCount) {		// 15번 문제에서는 불필요
				maximumCount = currentCount;
				tttNumber = stunnelNumber;
			}
		}
		resultZip = resultZip + stunnelNumber + currentCount;
		
		System.out.print("터널의 길이는 " + maximumCount + "이고 ");
		System.out.println("가장 긴 터널의 이름은 " + (char)tttNumber + "터널이다.");
		 
		// 문제 15
		System.out.println("문제 15");
		System.out.println(resultZip);
	}

}

package _03for;

public class test03p특별01 {

	public static void main(String[] args) {
		String aNumbers = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		
		int[] b = new int[10];
		
		for(int i = 0; i < aNumbers.length(); i++) {
			if(aNumbers.charAt(i) == '0') {
				b[0]++;
			} else if(aNumbers.charAt(i) == '1') {
				b[1]++;
			} else if(aNumbers.charAt(i) == '2') {
				b[2]++;
			}
		}	System.out.println(b[0] + " " + b[1] + " " + b[2]);
	}

}

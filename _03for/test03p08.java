package _03for;

public class test03p08 {

	public static void main(String[] args) {
		
		int [] b = {34, 2, 35, 8, 31, 45};
			int maxNumber = b[0];
		
        for(int i = 1; i < b.length; i++) {
        	if(b[i] > maxNumber) {
        		maxNumber = b[i];
			}
		}
        b[0] = maxNumber;
		System.out.println(maxNumber);
		System.out.println();
	}
}
package _03for;

public class test03p07 {

	public static void main(String[] args) {
		
		int [] b = {34, 2, 35, 8, 31, 45};
		int ascendingNumber = 0;
		int preNumber = 0;
		int tempNumber = 0;
		
        for(int i = 0; i < b.length - 1; i++) {
        	ascendingNumber = b[i];
        	preNumber = b[i+1];
        	if(b[i] > (b[i + 1])) {
        		tempNumber = ascendingNumber;
        		ascendingNumber = preNumber;
        		preNumber = tempNumber;        		
			}
		}	
		System.out.println(preNumber);
		System.out.println();
	}
}

package _03for;

public class test03p특별02 {

	public static void main(String[] args) {
		String a ="67/414/1/23/32/45/54/12/11/232";
		
		 	int totalCount = 0;
	        int number = 0;
	        
	        for (int i = 0; i < a.length(); i++) {
	            char c = a.charAt(i);
	            
	            if(c != '/' ) {
	            	number = number * 10 + Character.getNumericValue(c);
	            	
	            }
	            else if(c == '/') {	
	            	totalCount += number;
		            number = 0;
	            }
	        }
	        totalCount += number;
	        System.out.println("총 해충의 수: " + totalCount);
	}
}
package _03for;

public class test03p06 {

    public static void main(String[] args) {
        String a = "23-56+45*2-56";
        int totalCount = 0;
        int currentNumber = 0;
        char lastOperation = ' ';

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if(c >= '0' && c <= '9') {
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
            	if(totalCount == 0) {
            		totalCount += currentNumber;
            	}
                if(lastOperation == '+') {
                    totalCount += currentNumber;
                } else if (lastOperation == '-') {
                    totalCount -= currentNumber;
                } else if (lastOperation == '*') {
                    totalCount *= currentNumber;
                }

                lastOperation = c;
                currentNumber = 0;
            }
        }

        if (lastOperation == '+') {
            totalCount += currentNumber;
        } else if (lastOperation == '-') {
            totalCount -= currentNumber;
        } else if (lastOperation == '*') {
            totalCount *= currentNumber;
        }

        System.out.println("총 해충의 수: " + totalCount);
    }
}
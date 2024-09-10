package _2dArray;
import java.util.Scanner;
public class _test09 {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int[][] a = {
            {12, 12, 12, 4},
            {1, 1, 1, 4},
            {1, 13, 13, 13},
            {14, 17, 13, 19},
            {14, 22, 13, 24},
            {14, 14, 14, 4}
        };
        int nNum = in.nextInt();
        in.nextLine();
        for(int i = nNum / 10; i <= nNum / 10; i++) {
        	for(int j = nNum % 10; j < a[0].length; j++) {
        		if(i == 0) {
        			if(j <= 1) {
            			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
            			a[0][j] = (int)(Math.random() * 100);
            			a[0][j+1] = (int)(Math.random() * 100);
            			a[0][j+2] = (int)(Math.random() * 100);
            			}
            			} else if(j >= 2) {
            				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
            				a[0][j] = (int)(Math.random() * 100);
                			a[0][j-1] = (int)(Math.random() * 100);
                			a[0][j-2] = (int)(Math.random() * 100);
            				}
            			} else if(j > 0 && j < 3) {
            				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
            				a[0][j] = (int)(Math.random() * 100);
                			a[0][j+1] = (int)(Math.random() * 100);
                			a[0][j-1] = (int)(Math.random() * 100);
            				}        		
            			}
        		} else
        			if(i == 1) {
        		if(j <= 1) {
        			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
        			a[i][j] = a[i-1][j];
        			a[i][j+1] = a[i-1][j+1];
        			a[i][j+2] = a[i-1][j+2];
        			a[0][j] = (int)(Math.random() * 100);
        			a[0][j+1] = (int)(Math.random() * 100);
        			a[0][j+2] = (int)(Math.random() * 100);
        			}
        			} else if(j >= 2) {
        				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
        				a[i][j] = a[i-1][j];
        				a[i][j-1] = a[i-1][j-1];
        				a[i][j-2] = a[i-1][j-2];
        				a[0][j] = (int)(Math.random() * 100);
            			a[0][j-1] = (int)(Math.random() * 100);
            			a[0][j-2] = (int)(Math.random() * 100);
        				}
        			} else if(j > 0 && j < 3) {
        				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
        				a[i][j] = a[i-1][j];
        				a[i][j+1] = a[i-1][j+1];
        				a[i][j-1] = a[i-1][j-1];
        				a[0][j] = (int)(Math.random() * 100);
            			a[0][j+1] = (int)(Math.random() * 100);
            			a[0][j-1] = (int)(Math.random() * 100);
        				}        		
        			}
        		} else
        			if( i == 2) {
        				if(j <= 1) {
                			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
                			a[i][j] = a[i-1][j];
                			a[i][j+1] = a[i-1][j+1];
                			a[i][j+2] = a[i-1][j+2];
                			a[i-1][j] = a[i-2][j];
                			a[i-1][j+1] = a[i-2][j+1];
                			a[i-1][j+2] = a[i-2][j+2];
                			a[0][j] = (int)(Math.random() * 100);
                			a[0][j+1] = (int)(Math.random() * 100);
                			a[0][j+2] = (int)(Math.random() * 100);
                			}
                			} else if(j >= 2) {
                				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
                				a[i][j] = a[i-1][j];
                				a[i][j-1] = a[i-1][j-1];
                				a[i][j-2] = a[i-1][j-2];
                				a[i-1][j] = a[i-2][j];
                    			a[i-1][j-1] = a[i-2][j-1];
                    			a[i-1][j-2] = a[i-2][j-2];
                				a[0][j] = (int)(Math.random() * 100);
                    			a[0][j-1] = (int)(Math.random() * 100);
                    			a[0][j-2] = (int)(Math.random() * 100);
                				}
                			} else if(j > 0 && j < 3) {
                				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
                				a[i][j] = a[i-1][j];
                				a[i][j+1] = a[i-1][j+1];
                				a[i][j-1] = a[i-1][j-1];
                				a[i-1][j] = a[i-2][j];
                    			a[i-1][j+1] = a[i-2][j+1];
                    			a[i-1][j-1] = a[i-2][j-1];
                				a[0][j] = (int)(Math.random() * 100);
                    			a[0][j+1] = (int)(Math.random() * 100);
                    			a[0][j-1] = (int)(Math.random() * 100);
                				}        		
                			}
        			} else
        				if( i == 3) {
            				if(j <= 1) {
                    			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
                    			a[i][j] = a[i-1][j];
                    			a[i][j+1] = a[i-1][j+1];
                    			a[i][j+2] = a[i-1][j+2];
                    			a[i-1][j] = a[i-2][j];
                    			a[i-1][j+1] = a[i-2][j+1];
                    			a[i-1][j+2] = a[i-2][j+2];
                    			a[i-2][j] = a[i-3][j];
                    			a[i-2][j+1] = a[i-3][j+1];
                    			a[i-2][j+2] = a[i-3][j+2];
                    			a[0][j] = (int)(Math.random() * 100);
                    			a[0][j+1] = (int)(Math.random() * 100);
                    			a[0][j+2] = (int)(Math.random() * 100);
                    			}
                    			} else if(j >= 2) {
                    				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
                    				a[i][j] = a[i-1][j];
                    				a[i][j-1] = a[i-1][j-1];
                    				a[i][j-2] = a[i-1][j-2];
                    				a[i-1][j] = a[i-2][j];
                        			a[i-1][j-1] = a[i-2][j-1];
                        			a[i-1][j-2] = a[i-2][j-2];
                        			a[i-2][j] = a[i-3][j];
                        			a[i-2][j-1] = a[i-3][j-1];
                        			a[i-2][j-2] = a[i-3][j-2];
                    				a[0][j] = (int)(Math.random() * 100);
                        			a[0][j-1] = (int)(Math.random() * 100);
                        			a[0][j-2] = (int)(Math.random() * 100);
                    				}
                    			} else if(j > 0 && j < 3) {
                    				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
                    				a[i][j] = a[i-1][j];
                    				a[i][j+1] = a[i-1][j+1];
                    				a[i][j-1] = a[i-1][j-1];
                    				a[i-1][j] = a[i-2][j];
                        			a[i-1][j+1] = a[i-2][j+1];
                        			a[i-1][j-1] = a[i-2][j-1];
                        			a[i-2][j] = a[i-3][j];
                        			a[i-2][j+1] = a[i-3][j+1];
                        			a[i-2][j-1] = a[i-3][j-1];
                    				a[0][j] = (int)(Math.random() * 100);
                        			a[0][j+1] = (int)(Math.random() * 100);
                        			a[0][j-1] = (int)(Math.random() * 100);
                    				}        		
                    			}
            			} else
            				if( i == 4) {
                				if(j <= 1) {
                        			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
                        			a[i][j] = a[i-1][j];
                        			a[i][j+1] = a[i-1][j+1];
                        			a[i][j+2] = a[i-1][j+2];
                        			a[i-1][j] = a[i-2][j];
                        			a[i-1][j+1] = a[i-2][j+1];
                        			a[i-1][j+2] = a[i-2][j+2];
                        			a[i-2][j] = a[i-3][j];
                        			a[i-2][j+1] = a[i-3][j+1];
                        			a[i-2][j+2] = a[i-3][j+2];
                        			a[i-3][j] = a[i-4][j];
                        			a[i-3][j+1] = a[i-4][j+1];
                        			a[i-3][j+2] = a[i-4][j+2];
                        			a[0][j] = (int)(Math.random() * 100);
                        			a[0][j+1] = (int)(Math.random() * 100);
                        			a[0][j+2] = (int)(Math.random() * 100);
                        			}
                        			} else if(j >= 2) {
                        				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
                        				a[i][j] = a[i-1][j];
                        				a[i][j-1] = a[i-1][j-1];
                        				a[i][j-2] = a[i-1][j-2];
                        				a[i-1][j] = a[i-2][j];
                            			a[i-1][j-1] = a[i-2][j-1];
                            			a[i-1][j-2] = a[i-2][j-2];
                            			a[i-2][j] = a[i-3][j];
                            			a[i-2][j-1] = a[i-3][j-1];
                            			a[i-2][j-2] = a[i-3][j-2];
                            			a[i-3][j] = a[i-4][j];
                            			a[i-3][j-1] = a[i-4][j-1];
                            			a[i-3][j-2] = a[i-4][j-2];
                        				a[0][j] = (int)(Math.random() * 100);
                            			a[0][j-1] = (int)(Math.random() * 100);
                            			a[0][j-2] = (int)(Math.random() * 100);
                        				}
                        			} else if(j > 0 && j < 3) {
                        				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
                        				a[i][j] = a[i-1][j];
                        				a[i][j+1] = a[i-1][j+1];
                        				a[i][j-1] = a[i-1][j-1];
                        				a[i-1][j] = a[i-2][j];
                            			a[i-1][j+1] = a[i-2][j+1];
                            			a[i-1][j-1] = a[i-2][j-1];
                            			a[i-2][j] = a[i-3][j];
                            			a[i-2][j+1] = a[i-3][j+1];
                            			a[i-2][j-1] = a[i-3][j-1];
                            			a[i-3][j] = a[i-4][j];
                            			a[i-3][j+1] = a[i-4][j+1];
                            			a[i-3][j-1] = a[i-4][j-1];
                        				a[0][j] = (int)(Math.random() * 100);
                            			a[0][j+1] = (int)(Math.random() * 100);
                            			a[0][j-1] = (int)(Math.random() * 100);
                        				}        		
                        			}
                			} else
                				if( i == 5) {
                    				if(j <= 1) {
                            			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
                            			a[i][j] = a[i-1][j];
                            			a[i][j+1] = a[i-1][j+1];
                            			a[i][j+2] = a[i-1][j+2];
                            			a[i-1][j] = a[i-2][j];
                            			a[i-1][j+1] = a[i-2][j+1];
                            			a[i-1][j+2] = a[i-2][j+2];
                            			a[i-2][j] = a[i-3][j];
                            			a[i-2][j+1] = a[i-3][j+1];
                            			a[i-2][j+2] = a[i-3][j+2];
                            			a[i-3][j] = a[i-4][j];
                            			a[i-3][j+1] = a[i-4][j+1];
                            			a[i-3][j+2] = a[i-4][j+2];
                            			a[i-4][j] = a[i-5][j];
                            			a[i-4][j+1] = a[i-5][j+1];
                            			a[i-4][j+2] = a[i-5][j+2];
                            			a[0][j] = (int)(Math.random() * 100);
                            			a[0][j+1] = (int)(Math.random() * 100);
                            			a[0][j+2] = (int)(Math.random() * 100);
                            			}
                            			} else if(j >= 2) {
                            				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
                            				a[i][j] = a[i-1][j];
                            				a[i][j-1] = a[i-1][j-1];
                            				a[i][j-2] = a[i-1][j-2];
                            				a[i-1][j] = a[i-2][j];
                                			a[i-1][j-1] = a[i-2][j-1];
                                			a[i-1][j-2] = a[i-2][j-2];
                                			a[i-2][j] = a[i-3][j];
                                			a[i-2][j-1] = a[i-3][j-1];
                                			a[i-2][j-2] = a[i-3][j-2];
                                			a[i-3][j] = a[i-4][j];
                                			a[i-3][j-1] = a[i-4][j-1];
                                			a[i-3][j-2] = a[i-4][j-2];
                                			a[i-4][j] = a[i-5][j];
                                			a[i-4][j-1] = a[i-5][j-1];
                                			a[i-4][j-2] = a[i-5][j-2];
                            				a[0][j] = (int)(Math.random() * 100);
                                			a[0][j-1] = (int)(Math.random() * 100);
                                			a[0][j-2] = (int)(Math.random() * 100);
                            				}
                            			} else if(j > 0 && j < 3) {
                            				if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
                            				a[i][j] = a[i-1][j];
                            				a[i][j+1] = a[i-1][j+1];
                            				a[i][j-1] = a[i-1][j-1];
                            				a[i-1][j] = a[i-2][j];
                                			a[i-1][j+1] = a[i-2][j+1];
                                			a[i-1][j-1] = a[i-2][j-1];
                                			a[i-2][j] = a[i-3][j];
                                			a[i-2][j+1] = a[i-3][j+1];
                                			a[i-2][j-1] = a[i-3][j-1];
                                			a[i-3][j] = a[i-4][j];
                                			a[i-3][j+1] = a[i-4][j+1];
                                			a[i-3][j-1] = a[i-4][j-1];
                                			a[i-4][j] = a[i-5][j];
                                			a[i-4][j+1] = a[i-5][j+1];
                                			a[i-4][j-1] = a[i-5][j-1];
                            				a[0][j] = (int)(Math.random() * 100);
                                			a[0][j+1] = (int)(Math.random() * 100);
                                			a[0][j-1] = (int)(Math.random() * 100);
                            				}        		
                            			}
                    			}
                				
        				
        	}
        }
        for(int k = 0; k < a.length; k++) {
        	for(int q = 0; q < a[0].length; q++) {
        		System.out.print(a[k][q] + " ");
        	}
        	System.out.println();
        }
    }
}
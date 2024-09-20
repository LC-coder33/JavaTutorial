package _10_Class_Test;

public class MetroOne {			// 정상 운행하는 기차를 다룸
    String metroNumber = null; // 기차번호
    String metroInfo = null;   // 기차종류
    String arrival = null;		// 도착시간
    
    public MetroOne() {
    	
    }

    public void prt() {
        System.out.println("기차번호: " + metroNumber + " 기차종류: " + metroInfo + " 도착시간: " + arrival);
    }
}
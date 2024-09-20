package _10_Class_Test;

public class Maintenance {		// 수리 중인 기차를 다룸
    String metroNumber = null; // 기차번호
    String metroInfo = null;   // 기차종류
    String arrival = null;		// 도착시간
    
    public void fprt() {
    	 System.out.println("수리정보: " + "수리 중인 기차번호: " + metroNumber + " 기차종류: " + metroInfo + " 도착시간: " + arrival);
    }
}

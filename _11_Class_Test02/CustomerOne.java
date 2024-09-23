package _11_Class_Test02;

public class CustomerOne {
	String cId = null;
	String cName = null;
	String eName = null;
	String eBody = null;
	
	public CustomerOne() {
		
	}
	
    public void prt() {
        System.out.println("고객 아이디: " + cId + " 고객 성함: " + cName);
    }
    
    public void ePrt() {
    	System.out.println("고객 아이디: " + cId + " 고객 성함: " + cName + " 이벤트 이름: " + eName + " 이벤트 내용: " + eBody);
    }

}

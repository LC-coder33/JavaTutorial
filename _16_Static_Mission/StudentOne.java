package _16_Static_Mission;

public class StudentOne {
	private String sid = null;
	private String sname = null;
	private String snum = null;
	private int sgrade = 0;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}
	public int getSgrade() {
		return sgrade;
	}
	public void setSgrade(int sgrade) {
		this.sgrade = sgrade;
	}
	
	public void sPrt() {
		System.out.println("이름: " + sname );
		System.out.println("아이디: " + sid);
		System.out.println("전화번호: " + snum.substring(0,3) + "-" + snum.substring(3,7) + "-" + snum.substring(7,11));
		System.out.println(sgrade + "학년");
	}
}

package _16_Static_Mission;

public class ClassOne {
	private String cname = null;
	private String cnum = null;
	private String professor = null;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void cPrt() {
		System.out.println("과목명: " + cname);
		System.out.println("강의실: " + cnum);
		System.out.println("교수: " + professor);
	}
}

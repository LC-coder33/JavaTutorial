package _12_Method;

public class Main1 {

	public static void main(String[] args) {
		Testmethod t = new Testmethod();
		System.out.println(t.name);
		t.setName("hong");
		System.out.println(t.name);
		System.out.println(t.getName());
		String resultName = t.getName2("1122");
		if(resultName!=null) {
			System.out.println(resultName);
		} else {
			System.out.println("비번틀림");
		}
		System.out.println(t.maskName("*".repeat(t.name.length())));
	}

}

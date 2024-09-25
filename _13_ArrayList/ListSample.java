package _13_ArrayList;

import java.util.ArrayList;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	public ListSample() {
		System.out.println("리스트의 길이 " + a.size());
		a.add("apple");
		System.out.println("리스트의 길이 " + a.size());
		a.add("pear");
		System.out.println("리스트의 길이 " + a.size());
		a.add("peach");
		System.out.println("리스트의 길이 " + a.size());
		a.remove(2);
		a.set(0,"air");
		System.out.println(a.get(1));
		for(int i = 0 ; i < a.size(); i++) {
			System.out.print(a.get(i) + "\t");
		}
		System.out.println();
		System.out.println(a);
		for(int i = 0 ; i < a.size(); i++) {
			if(i != 0) {
				System.out.print(a.get(i) + "\t");	
			}
		}
		System.out.println();
		a.add(1, "banana");
		System.out.println(a);
		for(int i = 0 ; i < a.size(); i++) {
			if(a.get(i).charAt(0) != 'a') {
				System.out.print(a.get(i) + "\t");	
			}
		}
	}
}

package chapter5;

import java.util.ArrayList;

public class video33 {
	public static void main(String[] agrs) {
		int a = 10;
		ArrayList<String> a1 = new ArrayList<String>();
		// a1.add(2);
		a1.add("Manhtran Dev");
		a1.add("Manhtran Dev 2");

		a1.add("Manhtran Dev 3");

		a1.add("Manhtran Dev 4");
		a1.remove(1);
		System.out.println(a1.toString() + " " + a1.size());
		System.out.println(a1.get(2));

	}
}

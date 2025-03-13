package chapter6;

import java.util.ArrayList;

public class StudentMain {
	public static void main(String[] agrs) {
		Student st1 = new Student("Manh abc", "1");
		Student st2 = new Student("Nam cba", "2");

		Student st3 = new Student("Nguyen dfa", "3");

		Student st4 = new Student("Hung Nguyen", "4");

		Student st5 = new Student("Tuan cry", "5");
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Sinh vien co ho Nguyen " + arr.get(i));
			}
		}
	}
}

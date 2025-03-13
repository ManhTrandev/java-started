package chapter4;

public class video28 {
	public static void main(String[] agrs) {
		student st1 = new student();
		student st2 = new student("Manh", 24);
		st2.setName("Update name");
		System.out.println("Ten " + st2.getName() + " tuoi " + st2.getAge());
	}
}

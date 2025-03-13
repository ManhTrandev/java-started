package chapter4;

public class student {
	private String name;
	private int age;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public student() {

	}

	public student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void learnJava() {
		System.out.println("Hoc java");
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}
}

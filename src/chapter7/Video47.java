package chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
//	void eat() {
//		System.out.println("dog is eating...");
//	}
}

class BabyDog extends Dog {
	void eat() {
		System.out.println("Babydog is eating...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating...");
	}
}

public class Video47 {
	public static void main(String args[]) {
		System.out.println(">>> Video 47");
		Animal a = new Cat();
		a.eat();
	}

}

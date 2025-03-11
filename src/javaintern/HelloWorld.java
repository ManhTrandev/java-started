package javaintern;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		int a = 6;
//		int b = 9;
//		int c = Math.max(6, 9);
//		System.out.println("Max = " + c);

		Scanner scanner = new Scanner(System.in);
		System.out.println("First Number : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Second Number : ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min is : " + Math.min(firstNumber, secondNumber));
		scanner.close();
	}
}

package chapter9;

import java.util.Scanner;

public class Video53 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		try {
			int x = scanner.nextInt();
			System.out.println("Run x = " + x);

			System.out.println("Run try");
		} catch (Exception e) {
			System.out.println("Run catch");

		} finally {
			System.out.println("Run final");

			scanner.close();
		}
//		try (Scanner scanner = new Scanner(System.in)) {
//			int x = scanner.nextInt();
//		}

	}
}

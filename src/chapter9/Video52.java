package chapter9;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			try {
				System.out.println("Nhap x = ");

				int x = scanner.nextInt();
				try {
					System.out.println("Ket qua 10/x = " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("Run x = " + x);

				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Run error");
			}
			scanner.close();
		}
	}
}

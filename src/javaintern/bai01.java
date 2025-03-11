package javaintern;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
//		System.out.println("Check bai 01 : ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten sinh vien : ");
		String name = scanner.nextLine();
		System.out.println("Diem ");
		int score = scanner.nextInt();
		System.out.println(name + " Co diem " + score);
		scanner.close();

	}
}

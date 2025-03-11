package javaintern;

import java.util.Scanner;

public class lab01bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai : ");
		int cdai = scanner.nextInt();
		System.out.println("Nhap chieu rong : ");
		int crong = scanner.nextInt();
		int cv = (cdai + crong) * 2;
		int s = cdai * crong;
		System.out.println("Chu vi la : " + cv);
		System.out.println("Dien tich la : " + s);
		System.out.println("Min la : " + Math.min(cdai, crong));
		scanner.close();

	}
}

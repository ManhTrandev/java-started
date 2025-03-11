package javaintern;

import java.util.Scanner;

public class lab01bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri canh : ");
		int a = scanner.nextInt();
		System.out.println("The tich = " + Math.pow(a, 3));
		scanner.close();
	}
}

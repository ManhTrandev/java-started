package lab02;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien = ");
		int a = scanner.nextInt();
		int a1 = a * 1000;
		int a2 = 100 * 1000 + (a - 100) * 1500;
		if (a < 100) {
			System.out.println("So tien dien can thanh toan = " + a1);
		} else {
			System.out.println("So tien dien can thanh toan = " + a2);
		}

		scanner.close();
	}
//	- Nếu số điện <= 100 => số tiền = số điện x 1000
//			- Nếu số điện > 100
//			=> số tiền = 100 * 1000 + (số điện - 100) * 1500

}

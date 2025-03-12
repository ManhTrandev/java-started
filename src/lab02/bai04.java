package lab02;

import java.util.Scanner;

public class bai04 {
	public static void bai01() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
		float x;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a = ");
		int a = scanner.nextInt();
		System.out.println("Nhap b = ");

		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		x = (float) -b / a;
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("x = " + x);

		}
		scanner.close();

	}

	public static void bai02() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();

		System.out.print("Nhập vào biến c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);
		if (a == 0) {

			System.out.printf("Giải phương trình bậc nhat  %dx + %d = 0 \n", b, c);
			if (b == 0 && c == 0) {

				System.out.println("Phương trình có voso nghiệm");

			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình không có nghiệm");

			}

			else {
				float x3 = -b / 2 * c;
				System.out.println("Phương trình có nghiệm" + x3);

			}
		}

		else {
			int del = b * b - 4 * a * c;

			if (del < 0) {
				System.out.println("Phương trình không có nghiệm");

			} else if (del == 0) {
				float x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kep x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(del)) / (2 * a);
				double x2 = (-b - Math.sqrt(del)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm x1=%.3f , x2 =%.3f", x1, x2);
				// System.out.println("x1 = " +);

			}

		}
		scanner.close();
	}

	public static void bai03() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");

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

	public static void main(String[] agrs) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);

		int value = scanner.nextInt();
		switch (value) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.out.println("| 4. Kết thúc |");
			System.out.println("++ ------------------ ++");
			System.exit(0);
		}
		scanner.close();
	}
}

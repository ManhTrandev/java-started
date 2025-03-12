package lab02;

import java.util.Scanner;

public class bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm = %.5f  ", x);
		}
	}

	public static void main(String[] agrs) {
//	- Nếu a = 0 => làm tương tự ví dụ bài 1
//			- Nếu a # 0:
//			- Tính delta = b^2 - 4ac.
//			- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//			- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//			- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//			x1 = (-b + căn(delta))/(2*a)
//			x2 = (-b - căn(delta))/(2*a)
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();

		System.out.print("Nhập vào biến c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);
		if (a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
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
}

package lab02;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] agrs) {
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

}

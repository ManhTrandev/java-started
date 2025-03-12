package javaintern;

import java.util.Scanner;

public class lab01bai02 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("Ban da lua chon phep cong");
			break;
		case 2:
			System.out.println("Ban da lua chon phep tru");
			break;
		default:
			System.out.println("Ban da lua chon thoat chuong trinh");
			System.exit(0);
		}
		int value1 = scanner.nextInt();

		scanner.close();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap thu nhap ca nhan : ");
//		int luong = scanner.nextInt();
//		if (luong < 10) {
//			System.out.println("Khong phai dong thue");
//		} else if (10 <= luong && luong <= 15) {
//			System.out.println("Thue 10%");
//		} else if (15 <= luong && luong <= 30) {
//			System.out.println("Thue 20%");
//		} else
//
//		{
//			System.out.println("Thue 50%");
//		}
//
//		scanner.close();

	};
};

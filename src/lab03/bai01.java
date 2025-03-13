package lab03;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] agrs) {
//	- Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
//	- Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số nguyên tố
//	- Sử dụng toán tử % để biết có chia hết hay không ?
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so : ");
		int x = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < x - 1; i++) {
			if (x % i == 0) {
				System.out.printf("Co uoc chung khac la %d ", i);
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.printf("So %d la so nguyen to ", x);

		} else {
			System.out.printf("So %d khong la so nguyen to ", x);

		}
		scanner.close();
	}
}

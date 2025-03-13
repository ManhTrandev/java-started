package lab03;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so bat ki : ");
		int x = scanner.nextInt();

		System.out.printf("Bang cuu chuong cua %d la : ", x);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d ", x, i, x * i);

		}
//		Dùng vòng lặp từ 1 tới 10
//		sysout(" %d x %d = %d ", x, i, x*i)
		scanner.close();
	}
}

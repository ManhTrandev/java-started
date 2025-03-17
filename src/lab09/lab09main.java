package lab09;

import java.util.Scanner;

public class lab09main {
	public static int nhapMasv() {
		Scanner scanner = new Scanner(System.in);
		int result;
		while (true) {
			System.out.println("Ma sinh vien : ");

			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Ma sinh vien khong hop le , nhap vao 1 day so : ");
				scanner.next();
			}
		}
		scanner.close();
		return result;
	}

	public static void nhapHoten() {
		System.out.println("Ho va ten sinh vien : ");

	}

	public static void nhapDiem() {
		System.out.println("Diem cua sinh vien : ");

	}

	public static void nhapTuoi() {
		System.out.println("Tuoi cua sinh vien : ");

	}

	public static void main(String[] agrs) {
		System.out.println("Run lab 9 ");

		try (Scanner scanner = new Scanner(System.in);) {
			int masv = nhapMasv();
			// System.out.println("Ma sinh vien la : " + masv);
			SinhVien sv1 = new SinhVien(masv, "Tran Manh", 9.5, 24);
			System.out.println(sv1);

//			nhapHoten();
//			nhapDiem();
//			nhapTuoi();
		}
	}
}

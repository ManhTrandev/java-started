package chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class btString1 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> user = new ArrayList<String>();

		System.out.println("Nhap username : ");
		String username = scanner.nextLine();
		user.add(username);
		System.out.println("Nhap password : ");
		String pw = scanner.nextLine();
		ArrayList<String> pass = new ArrayList<String>();
		pass.add(pw);
		System.out.println("Your username : " + username);
		System.out.println("Your password : " + pw);

		if (username.equals("manhtran") && pw.length() > 6) {
			System.out.println("Loading... ");
		}
//		System.out.println(">>>Check user... " + user);
//		System.out.println(">>>Check pass... " + pass);

		scanner.close();

	}
}
//Ví dụ 1: Nhập username và password từ bàn phím. Nếu username = "hoidanit" và
//password > 6 ký tự thì hợp lệ
//gợi ý: sử dụng equals để so sánh; length để check chiều dài
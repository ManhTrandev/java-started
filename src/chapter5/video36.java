
//Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa
//nhập và tính tổng của nó
//Gợi ý: sử dụng ArrayList<double> để lưu trữ
////nhập số lượng tùy thích
//While(true){
//Double x = scanner.nextDouble();
//list.add(x);
//sysout("Nhập thêm (Y/N))?
//if(scanner.nextLine().equals("N"){ // why using equals ?
//break;
//}
//}
//tính tổng = vòng lặp for
package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class video36 {
	public static void main(String[] agrs) {
		ArrayList<Double> list = new ArrayList<Double>();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập thêm so bat ki = ");

			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();
			System.out.println("Nhập thêm (Y/N))?");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;

			}

		}
		System.out.println("Check list = " + list);
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("Sum = " + sum);

	}
}

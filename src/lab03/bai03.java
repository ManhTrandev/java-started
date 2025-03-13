package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai03 {
	public static void main(String[] agrs) {
//		- Sắp xếp và xuất mảng vừa nhập ra màn hình
//		- Xuất phần tử có giá trị nhỏ nhất
//		- Xuất phần tử có giá trị lớn nhất
//		Gợi ý:
//		- Sử dụng Arrays.sort
//		- Sử dụng Math.min, Math.max
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of size of array");
		size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element");
		// For reading the element
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		// For print the array element
		for (int i : a) {
			System.out.print(i + " ");
		}
		Arrays.sort(a);
		System.out.println("Sau khi sap xep lai mang : " + Arrays.toString(a));

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);

		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);

		}
		System.out.println("SLN : " + max);

		System.out.println("SLN : " + min);
		scanner.close();
	}

}

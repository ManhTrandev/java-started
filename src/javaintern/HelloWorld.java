package javaintern;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] clubs = { 5, 20, 40, 3 };
//		Arrays.sort(clubs);
		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] < clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));

	}
}

package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
	public static void main(String[] agrs) {
		System.out.println("Run test ");
		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher matcher = pattern.matcher("Manh@afas.com");
		System.out.println("Run test checkout : " + matcher.matches());

	}
}
//Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc
//biệt
//Ví dụ hợp lệ: 099145697413
//không hợp lệ: 09914569741a (chứa ký tự là chữ số)
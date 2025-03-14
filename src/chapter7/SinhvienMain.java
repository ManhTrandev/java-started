package chapter7;

public class SinhvienMain {
	public static void main(String[] agrs) {
		System.out.println("Run SV  ");
		SinhVIenIT s1 = new SinhVIenIT("JAVA", "1", "Manh", 10.0, 0.1);
		System.out.println("Check s1 : " + s1.name);
		SinhVienMkt s2 = new SinhVienMkt("English", "2", "Hip", 30.0, 0.3);
		System.out.println("Check s2 : " + s2.name);

	}
}

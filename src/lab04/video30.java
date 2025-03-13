package lab04;

public class video30 {
	public static void main(String[] agrs) {
		Product test = new Product();
		Product pr1 = test.nhapThongTin("May tinh", 200, 0.2);
		test.xuatThongTin(pr1);
		// System.out.println("Run");
		System.out.println("Gia thue = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}

package lab07;

public class lap07Main {
	public static void main(String[] agrs) {
		System.out.println("Run Main : ");
		SinhVien it1 = new SinhVienIT(10, 9);
		System.out.println(">>> Score sinh vien IT : " + it1.getScore());
		SinhVien ck1 = new SinhVienCoKhi(7, 7);
		System.out.println(">>> Score sinh vien CK : " + ck1.getScore());
	}
}

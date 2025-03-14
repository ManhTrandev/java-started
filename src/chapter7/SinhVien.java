//Tạo 3 class:
//- SinhVien (super class)
//+ getDiem (phương thức trừu tượng)
//- SinhVienIT (child class)
//+ scoreJava : double
//+ scoreHTML : double
//getDiem = (scoreJava * 2 + scoreHTML)/3;
//
//- SinhVienCoKhi (child class)
//+ scoreCNC : double
//+ scorePLC : double
//getDiem = (scoreCNC + scorePLC)/2;

package chapter7;

public abstract class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	abstract void tinhDiem();

	// abstract void getDiem();

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("Run info from parent");

	}

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
}

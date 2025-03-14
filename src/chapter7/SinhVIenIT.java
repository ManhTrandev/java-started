package chapter7;

public class SinhVIenIT extends SinhVien {
	private String language;

	public SinhVIenIT(String language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void getMoney() {
		System.out.println("Run get money");
		this.info();
	}

	public void info() {
		System.out.println("Run get SinhVienIT");

	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}

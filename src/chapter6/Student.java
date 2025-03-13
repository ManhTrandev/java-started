package chapter6;

public class Student {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student() {

	}

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

//Ứng dụng quản lý sinh viên
//- Tạo class Student với thuộc tính name, id
//- Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
//eg: new Student("Nam", 1); new Student("Eric", 2);
//Yêu cầu: tìm và xuất ra:
//- các student có tên bắt đầu là "Nguyễn"
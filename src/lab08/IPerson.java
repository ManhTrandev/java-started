package lab08;

public interface IPerson {
	void input();

	void display();
}
//- Tạo interface IPerson với 2 method:
//+ void input( )
//+ void display( )
//- Tạo class Person kế thừa interface ở trên, và có thêm:
//protected String id;
//protected String name;
//protected int age;
//+ viết constructor, setter, getter
//- Tạo class Student kế thừa class Person, và có thêm:
//private int mark;
//private String grade;
//+ viết getter cho mark, grade
//+ viết setter cho mark
//+ viết setter cho grade theo công thức:
//nếu mark >=8 thì grade = "A"
//nếu mark >=7 thì grade = "B"
//nếu mark >=6 thì grade = "C"
//nếu mark >=5 thì grade = "D"
//nếu mark <5 thì grade = "Tạch cmnr"
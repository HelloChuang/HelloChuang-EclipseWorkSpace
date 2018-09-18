package 类与对象;
class Computer {
	String computerType;
}
public class Student {
	String name;
	int age;
	int id;
	Computer com = new Computer();
	void study() {
		System.out.println(com.computerType);
	}
	
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "gaochuang";
		Computer com = new Computer();
		com.computerType = "联想";
		stu.com = com;
		stu.study();
		
		
	}
}


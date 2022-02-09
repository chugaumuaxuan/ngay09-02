package MainWithinTheClass;

import MainOutsideClass.Main;

//khoi tao thong qua method
public class Student {
	String name;
	int age;
	
	void insertData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Student: " + name + " " + age+ " tuoi");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		Student st1 = new Student();
		Student st2 = new Student();
		
		st.insertData("Doan", 11);
		st.display();
		
		st1.insertData("Duc", 23);
		st1.display();
		
		st2.insertData("Thang", 29);
		st2.display();
	}
	
}

package ArrayOfObject;

public class Student {
	String name;
	
	Student(){}
	
	Student(String name){
		this.name = name;
	};
	
	public static void main(String[] args) {
		
//		Student[] array = new Student[3];
		
		Student st1 = new Student("Thang");
		Student st2 = new Student("Doan");
		Student st3 = new Student("Duc");
		
//		array[0] = st1;
//		array[1] = st2;
//		array[2] = st3;

		Student[] array = {st1, st2 , st3};
		
		System.out.println(array[0].name);
		System.out.println(array[1].name);
		System.out.println(array[2].name);
	}

}

package MainWithinTheClass;

//khoi tao qua tham chieu
public class Cat {
	String name;
	int age;
	
	public static void main(String[] args) {
		Cat meo1 = new Cat();
		Cat meo2 = new Cat();
		Cat meo3 = new Cat();
		
		meo1.name = "Allie";
		meo1.age = 1;
		
		meo2.name = "Dua Hua";
		meo2.age = 2;
		
		meo3.name = "Chuoi";
		meo3.age = 3;
		
		System.out.println("Meo " + meo1.name + " " + meo1.age + " tuoi");
		System.out.println("Meo " + meo2.name + " " + meo2.age + " tuoi");
		System.out.println("Meo " + meo3.name + " " + meo3.age + " tuoi");
		
	}
	
}

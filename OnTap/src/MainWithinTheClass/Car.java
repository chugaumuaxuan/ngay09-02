package MainWithinTheClass;

//khoi tao bang constructor
public class Car {
	String name;
	int age;
	
	Car(String name, int age){
		this.name = name ;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("honda" , 1);
		Car c2 = new Car("suzuki" , 2);
		Car c3 = new Car("toyota" , 3);
		
		System.out.println("xe " + c1.name + " da su dung "  + c1.age + " nam");
		System.out.println("xe " + c2.name + " da su dung "  + c2.age + " nam");
		System.out.println("xe " + c3.name + " da su dung "  + c3.age + " nam");
	}
	
	
}

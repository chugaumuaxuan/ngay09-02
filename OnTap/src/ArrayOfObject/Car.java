package ArrayOfObject;

public class Car {
	String name;
	
	void insertData(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		Car[] Parking = new Car[3];
		
		Car x1 = new Car();
		Car x2 = new Car();
		Car x3 = new Car();
		
		Parking[0] = x1;
		Parking[1] = x2;
		Parking[2] = x3;
		
		x1.insertData("honda");
		x2.insertData("Suzuki");
		x3.insertData("Mazda");
		
		for(int i = 0; i <Parking.length ; i++) {
			System.out.println(Parking[i].name);
		}
		
		
		
	}
	
}

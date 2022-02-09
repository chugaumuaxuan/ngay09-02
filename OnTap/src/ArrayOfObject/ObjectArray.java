package ArrayOfObject;

class Account{
	int a;
	int b;
	
	
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void showData() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class ObjectArray {
	public static void main(String[] args) {
		Account[] Array = new Account[2];
	
		Array[0] = new Account();
		Array[1] = new Account();
		

		
		Array[0].setData(1, 2);
		Array[1].setData(6, 3);
		
		Array[0].showData();
		Array[1].showData();
	}
}

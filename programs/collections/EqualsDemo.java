package collectionapp;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String st1 = new String("abc");
		String st2 = new String("abc");
		
		if(st1.equals(st2)) {
			System.out.println("equals");
		}
		else {
			System.out.println("Not equals");
		}
		
		A a1 = new A(10);
		A a2 = new A(10);
		
		if(a1.equals(a2)) {
			System.out.println("both are equals");
		}
		else {
			System.out.println("both not are equals");
		}
	}
}

class A {
	int i;
	A(int i) {
		this.i = i;
	}
}
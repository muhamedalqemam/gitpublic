package courses;

public class MammalInt implements IAnimal {
	public void eat() {
		System.out.println("Mammal eats.");
	}
	public void travel() {
		System.out.println("Mammal travels.");
	}
	public static void main(String[] args) {
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}
}
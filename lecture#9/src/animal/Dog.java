package animal;
public class Dog extends Animal {
	// Overriding: same method name & same parameter(s)
	// By using overriding, Run Time Polymorphism can be achieved
	
	@Override
	public void sound() { // Polymorphism
		System.out.println("Dog says: woof");
	}
}

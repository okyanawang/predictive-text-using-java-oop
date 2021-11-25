package animal;
public class Cow extends Animal {
	// Overriding: same method name & same parameter(s)
	// By using overriding, Run Time Polymorphism can be achieved
	
	@Override
	public void sound() { // Polymorphism
		System.out.println("Cow says: moo");
	}
}

package animal;
public class Cat extends Animal {
	// Overriding: same method name & same parameter(s)
	// By using overriding, Run Time Polymorphism can be achieved
	
	@Override
	public void sound() { // Polymorphism
		System.out.println("Cat says: meow");
	}
	
	// An example of Cat's method/function
	public void catMethod() {
		System.out.println("Cat: catMethod");
	}
}

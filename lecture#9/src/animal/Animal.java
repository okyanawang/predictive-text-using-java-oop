package animal;
public class Animal {
	// Information hiding = encapsulation
	// This class property set to be private -> cannot be accessed
	// directly. Only can be accessed by getter(s) & setter(s)
	private String name = "No name"; // Default name: No name
	private int age = 0; // Default age: 0
	private boolean vaccinated = false; // Default: false
	private double price = 10.0; // Default: 10.0
	
	// Overloading: a class has more than one method of
	// the same name & their parameter(s) are different
	
	// Constructor: special case of function, where its name
	// is the same with the class' name
	Animal() { // Overloading
		System.out.println("Animal: Default constructor");
	}
	Animal(String name) { // Overloading
		this.name = name;
		System.out.println("Constructor with name");
	}
	Animal(boolean vaccinated) { // Overloading
		this.vaccinated = vaccinated;
		System.out.println("Constructor with vaccinated status");
	}
	Animal(String name, int age) { // Overloading
		this.name = name;
		this.age = age;
		System.out.println("Constructor with name & age");
	}
	// Overriding: same method name & same parameter(s)
	// By using overriding, Run Time Polymorphism can be achieved
	public void sound() { // Polymorphism
		System.out.println("Animal makes a sound");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrice() { // Overloading
		return price;
	}
	public double getPrice(String name) { // Overloading
		if (name.equals("No name")) {
			return price + 100;
		} else {
			return price + 110;
		}
	}
	public double getPrice(String name, int age) { // Overloading
		if (name.equals("No name")) {
			if (age > 1) {
				return price + 200;
			} else {
				return price + 150;
			}
		} else {
			if (age > 1) {
				return price + 300;
			} else {
				return price + 200;
			}
		}
	}
	public double getPrice(boolean vaccinated) { // Overloading
		if (vaccinated) {
			return price + 400;
		} else {
			return price;
		}
	}
	public void setPrice(double price) {
		this.price= price;
	}
	@Override
	public String toString() { // Used for printing an instance
		return "[" + name + "]";
	}
}

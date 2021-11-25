package animal;
public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();  // Create an Animal object
		// Overloading
		Animal animal2 = new Animal("Bibi");  // With a name
		Animal animal3 = new Animal(true);   // With a vaccinated status
		Animal animal4 = new Animal("Chiki", 3);  // With a name & age
		System.out.println();
		
	    Animal cat = new Cat();  // Create a Cat object
	    Animal cow = new Cow();  // Create a Cow object
	    Animal dog = new Dog();  // Create a Dog object
	    System.out.println();
	    
	    // Polymorphism
	    animal.sound();
	    cat.sound();
	    cow.sound();
	    dog.sound();
	    System.out.println();
	    
	    // Overloading
	    System.out.println(animal);
	    System.out.println("Age: " + animal.getAge());
	    System.out.println("Price: " + animal.getPrice());
	    System.out.println("Vaccinated: " + animal.isVaccinated());
	    System.out.println();
	    
	    System.out.println(animal2);
	    System.out.println("Age: " + animal2.getAge());
	    System.out.println("Price: " + animal2.getPrice(animal2.getName()));
	    System.out.println("Vaccinated: " + animal2.isVaccinated());
	    System.out.println();
	    
	    System.out.println(animal3);
	    System.out.println("Age: " + animal3.getAge());
	    System.out.println("Price: " + animal3.getPrice(animal3.isVaccinated()));
	    System.out.println("Vaccinated: " + animal3.isVaccinated());
	    System.out.println();
	    
	    System.out.println(animal4);
	    System.out.println("Age: " + animal4.getAge());
	    System.out.println("Price: " + animal4.getPrice(animal3.getName(),
	    		animal3.getAge()));
	    System.out.println("Vaccinated: " + animal4.isVaccinated());
	    System.out.println();
	    
	    System.out.print("Showing that a superclass can  call ");
	    System.out.println("a subclass method");
	    System.out.println("-----------------------------------------------------");
	    System.out.println("a1 is defined by superclass: Animal, instantiated by superclass: Animal");
	    Animal a1 = new Animal();
	    System.out.println("b1 is defined by subclass: Cat, instantiated by subclass: Cat");
	    Cat b1 = new Cat();
	    System.out.println("b1 calls the Cat's method: catMethod()");
	    b1.catMethod();
//	    System.out.println("Try: a1 calls the subclass' method: catMethod() by casting to Cat");
//	    ((Cat) a1).catMethod(); // Exception will happen
	    System.out.println("c1 is defined by superclass: Animal, instantiated by subclass: Cat");
	    Animal c1 = new Cat();
//	    c1.catMethod(); // The subclass' method: catMethod() is undefined for the type Animal
	    ((Cat) c1).catMethod(); // Need to cast, so that an instance of superclass can call
	    						// the subclass' method
	}
}

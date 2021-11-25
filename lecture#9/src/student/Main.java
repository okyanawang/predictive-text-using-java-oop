package student;
public class Main {
	public static void main(String[] args) {
		// Fetch student record based on his roll no from the database
		Model model = retriveStudentFromDatabase();
		// Create a view: to write student details on console
		View view = new View();
		Controller controller = new Controller(model, view);
		controller.updateView();
		// Update model data
		controller.setStudentName("John");
		controller.updateView();
	}
	private static Model retriveStudentFromDatabase() {
		Model student = new Model();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}

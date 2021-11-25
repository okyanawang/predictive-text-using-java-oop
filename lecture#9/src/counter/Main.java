package counter;
public class Main {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		controller.initView("MVC demo",0);
		controller.setModelValue(10);
		System.out.println(controller.getModelValue());
	}
}

package counter;
public class Controller {
	private Model model;
	private View view;
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	public void setModelValue(int value) {
		model.setValue(value);
	}
	public int getModelValue() {
		return model.getValue();
	}
	public void initView(String title, int value) {
		view.init(title, value);
	}
}

package counter;
import java.util.Observable;
public class Model extends Observable {
	private int value;
	public Model() {
		value = 0;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		setChanged();
        notifyObservers();
	}
	public void incValue() {
        value++;
        setChanged();
        notifyObservers(value);
    }
    public void decValue() {
        value--;
        setChanged();
        notifyObservers(value);
    }
}

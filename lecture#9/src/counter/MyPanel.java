package counter;
import java.awt.GridLayout;
import javax.swing.*;
public class MyPanel extends JPanel {
	private JLabel label = new JLabel("Counter:");
	private JTextField counter = new JTextField(6);
	protected JButton up = new JButton("Up");
    protected JButton down = new JButton("Down");
	public MyPanel() {
        GridLayout layout = new GridLayout(2, 2);
        // Horizontal gap between components
        layout.setHgap(20);
        // Vertical gap between components
        layout.setVgap(10);
        
        setLayout(layout);
        counter.setText("0");
        add(label);
        add(counter);
        add(up);
        add(down);
        counter.setEditable(false);
        up.setActionCommand("UP");
        down.setActionCommand("DOWN");
	}
	public void setCounter(String value) {
		counter.setText(value);
	}
}

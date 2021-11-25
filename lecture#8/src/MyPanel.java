import javax.swing.*;
public class MyPanel extends JPanel {
	int count = 0; // The state
	JButton button = new JButton("Click me");
	JLabel label = new JLabel("This is a label");
	public MyPanel() {
		add(button);
		add(label);
	}
}

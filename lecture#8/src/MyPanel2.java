import javax.swing.*;
import java.awt.event.*; // 1
public class MyPanel2 extends JPanel
	implements ActionListener { // 2
	JTextField t = new JTextField(15);
	public MyPanel2() {
		// ...
		add(t);
		t.addActionListener(this); // 3
	}
	public void actionPerformed(ActionEvent e) {
		// ...
		t.getText(); // 4
		// ...
	}
}

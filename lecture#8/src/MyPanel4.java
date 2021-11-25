import javax.swing.*;
import java.awt.event.*;
public class MyPanel4 extends JPanel
	implements ActionListener { // Declare panel listens
							    // to this type of event
	JTextField t = new JTextField(15);
	JLabel l;
	public MyPanel4() {
		add(t);
		t.addActionListener(this); // "Register" with text field
		l= new JLabel("Write something on text-field & enter");
		add(l);
	}
	public void actionPerformed(ActionEvent e) {
		// Define required method
		l.setText(t.getText()); 
	}
}

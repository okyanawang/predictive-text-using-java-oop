import javax.swing.*;
import java.awt.event.*; // 1
public class MyPanel3 extends JPanel
	implements ActionListener {
	JTextField t = new JTextField(15);
	JLabel l;
	public MyPanel3() {
		add(t);
		t.addActionListener(this);
		l= new JLabel("Write something on text-field & enter");
		add(l);
	}
	public void actionPerformed(ActionEvent e) {
		l.setText(t.getText()); 
	}
}

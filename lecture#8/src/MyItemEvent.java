import javax.swing.*;
import java.awt.event.*;
public class MyItemEvent extends JPanel implements ItemListener {
	JLabel label = new JLabel("Which one do you like?");
	JCheckBox cb1 = new JCheckBox("Mango");
	JCheckBox cb2 = new JCheckBox("Apple");
	JLabel explanation = new JLabel("You haven't check anything");
	public MyItemEvent() {
		add(label);
		add(cb1);
		add(cb2);
		add(explanation);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb3 = (JCheckBox) e.getItemSelectable();
		if (cb3.isSelected()) {
			explanation.setText(cb3.getText() + " is checked");
		} else {
			explanation.setText(cb3.getText() + " is unchecked");
		}
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Item event");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 150);
		MyItemEvent panel = new MyItemEvent();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

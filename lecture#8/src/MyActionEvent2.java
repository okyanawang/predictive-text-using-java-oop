import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyActionEvent2 extends JPanel implements ActionListener {
	JButton darken = new JButton("Darken"),
			lighten = new JButton("Lighten");
	int red = 255, green = 255, blue = 255;
	public MyActionEvent2() {
		add(darken);
		darken.addActionListener(this);
		add(lighten);
		lighten.addActionListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(red, green, blue));
		g.fillRect(10, 40, 100, 50);
	}
	int checkBoundary(int x) {
		if  (x < 0) {
			x = 0;
			darken.setEnabled(false);
		} else {
			darken.setEnabled(true);
		}
		if (x > 255) {
			x = 255;
			lighten.setEnabled(false);
		} else {
			lighten.setEnabled(true);
		}
		return x;
	}
	public void actionPerformed(ActionEvent e) {
		int delta = 0;
		if (e.getSource() == lighten) {
			delta = 10;
		} else if (e.getSource() == darken) {
			delta = -10;
		}
		red = checkBoundary(red + delta);
		green = checkBoundary(green + delta);
		blue = checkBoundary(blue + delta);
		repaint();
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Action event 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		MyActionEvent2 panel = new MyActionEvent2();
		frame.add(panel);
		frame.setVisible(true);
	}
}

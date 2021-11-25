import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyActionEvent3 extends JPanel {
	JButton darken = new JButton("Darken"),
			lighten = new JButton("Lighten");
	int red = 255, green = 255, blue = 255;
	private class DarkenListener implements ActionListener {
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
	}
	public MyActionEvent3() {
		add(darken);
		darken.addActionListener(new DarkenListener());
		add(lighten);
		lighten.addActionListener(new DarkenListener());
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
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Action event 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		MyActionEvent3 panel = new MyActionEvent3();
		frame.add(panel);
		frame.setVisible(true);
	}
}

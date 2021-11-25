import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyActionEvent extends JPanel implements ActionListener {
	JButton darken = new JButton("Darken");
	int red = 255, green = 255, blue = 255;
	public MyActionEvent() {
		add(darken);
		darken.addActionListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(red, green, blue));
		g.fillRect(10, 10, 100, 100);
	}
	public void actionPerformed(ActionEvent e) {
		red = red - 10;
		green = green - 10;
		blue = blue - 10;
		repaint();
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Action event");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 150);
		MyActionEvent panel = new MyActionEvent();
		frame.add(panel);
		frame.setVisible(true);
	}
}

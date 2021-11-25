import java.awt.*;
import javax.swing.*;
public class MyRedSquare extends JPanel {
	public MyRedSquare() {
		// super(); // Implicitly 
		setPreferredSize(new Dimension(100, 100));
		setBackground(Color.white);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Mandatory!
		g.setColor(new Color(255, 0, 0));
		g.fillRect(10, 10, 80, 80);
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Draw Red Square");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// We don't use: frame.setSize(250, 250); in here
		MyRedSquare panel = new MyRedSquare();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

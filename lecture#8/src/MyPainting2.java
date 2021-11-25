import java.awt.*;
import javax.swing.*;
public class MyPainting2 extends JPanel {
	public void paintComponent(Graphics g) {
		// Vertical line
		g.setColor(Color.red);
		g.drawLine(20, 20, 20, 120);
		// Horizontal line
		g.setColor(Color.green);
		g.drawLine(20, 20, 120, 20);
		// Diagonal line
		g.setColor(Color.blue);
		g.drawLine(20, 20, 120, 120);
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Draw Arrow (i.e., 3 lines)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setSize(250, 250);
		MyPainting2 panel = new MyPainting2();
		frame.add(panel);
		frame.setVisible(true);
	}
}

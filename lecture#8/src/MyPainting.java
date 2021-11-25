import java.awt.*;
import javax.swing.*;
public class MyPainting extends JPanel {
	public void paintComponent(Graphics g) {
		int x1, y1, x2, y2;
		x1 = y1 = x2 = 20;
		y2 = 120;
		g.drawLine(x1, y1, x2, y2);
		
		int x, y;
		x = y = 50; 
		int xSize, ySize;
		xSize = ySize = 20;
		g.drawRect(x, y, xSize, ySize);
		
		x = y = 80;
		g.fillRect(x, y, xSize, ySize);
		
		x = y = 105;
		g.drawOval(x, y, xSize, ySize);
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Draw shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setSize(200, 200);
		MyPainting panel = new MyPainting();
		frame.add(panel);
		frame.setVisible(true);
	}
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyMouseEvent extends JPanel implements MouseListener {
	JLabel label = new JLabel("Click for darkening the rectangle");
	int red = 255, green = 255, blue = 255;
	public MyMouseEvent() {
		add(label);
		addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(red, green, blue));
		g.fillRect(10, 30, 100, 100);
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {
		red = red - 10;
		green = green - 10;
		blue = blue - 10;
		repaint();
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Mouse event");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		MyMouseEvent panel = new MyMouseEvent();
		frame.add(panel);
		frame.setVisible(true);
	}
}

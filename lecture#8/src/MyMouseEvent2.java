import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyMouseEvent2 extends JPanel implements MouseListener {
	JLabel label = new JLabel("Click to draw an oval");
	int x = 50, y = 50;
	public MyMouseEvent2() {
		add(label);
		addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x, y, 20, 20);
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
		Point p = e.getPoint();
		x = p.x;
		y = p.y;
		repaint();
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Mouse event 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		MyMouseEvent2 panel = new MyMouseEvent2();
		frame.add(panel);
		frame.setVisible(true);
	}
}

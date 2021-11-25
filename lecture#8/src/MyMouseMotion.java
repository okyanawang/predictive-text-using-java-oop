import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyMouseMotion extends JPanel implements MouseMotionListener {
	JLabel label = new JLabel("Use your mouse to draw a picture.");
	JLabel xy = new JLabel();
	public MyMouseMotion() {
		add(label);
		add(xy);
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent e) {
		xy.setText("X: " + e.getX() + ", Y: " + e.getY());
		Graphics g = getGraphics();
		g.setColor(Color.blue);
		g.fillOval(e.getX(), e.getY(), 20, 20);
	}
	public void mouseMoved(MouseEvent e) {
		xy.setText("X: " + e.getX() + ", Y: " + e.getY());
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Mouse motion event");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		MyMouseMotion panel = new MyMouseMotion();
		frame.add(panel);
		frame.setVisible(true);
	}
}

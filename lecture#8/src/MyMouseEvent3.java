import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyMouseEvent3 extends JPanel implements
		ActionListener, MouseListener {
	JButton darken = new JButton("Darken");
	int red = 255, green = 255, blue = 255;
	JLabel label = new JLabel("Darkening -> Darken button click," +
			" Lightening -> mouse click");
	public MyMouseEvent3() {
		add(label);
		add(darken);
		darken.addActionListener(this);
		addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(red, green, blue));
		g.fillRect(10, 30, 100, 50);
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
		}
		if (x == 0) {
			label.setText("Darkening -> no more, it's the darkest" +
					" Lightening -> mouse click");
		} else if (x == 255) {
			label.setText("Darkening -> Darken button click," +
					" Lightening -> no more, it's the lightest");
		} else {
			label.setText("Darkening -> Darken button click," +
					" Lightening -> mouse click");
		}
		return x;
	}
	public void actionPerformed(ActionEvent e) {
		red = checkBoundary(red - 10);
		green = checkBoundary(green - 10);
		blue = checkBoundary(blue - 10);
		repaint();
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
		red = checkBoundary(red + 10);
		green = checkBoundary(green + 10);
		blue = checkBoundary(blue + 10);
		repaint();
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Mouse event 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(430, 120);
		MyMouseEvent3 panel = new MyMouseEvent3();
		frame.add(panel);
		frame.setVisible(true);
	}
}

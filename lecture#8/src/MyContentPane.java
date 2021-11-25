import java.awt.*; // BorderLayout, Container, etc.
import javax.swing.*; // JFrame, JLabel, etc.
public class MyContentPane {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFrame demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		JLabel labelOnePiece = new JLabel("One piece world");
		labelOnePiece.setIcon(new ImageIcon("res/one_piece_world.gif"));
		pane.add(labelOnePiece, BorderLayout.PAGE_START);
		pane.add(new JLabel("Hello world!"));
		pane.add(new JButton("Click me"), BorderLayout.PAGE_END);
		frame.pack();
		frame.setVisible(true);
	}
}

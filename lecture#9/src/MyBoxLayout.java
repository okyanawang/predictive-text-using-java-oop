import java.awt.*; // BoxLayout, etc.
import javax.swing.*; // JFrame, JLabel, etc.
public class MyBoxLayout {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("BoxLayout demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		JLabel labelOnePiece = new JLabel("One piece world");
		labelOnePiece.setIcon(new ImageIcon("res/one_piece_world.gif"));
		pane.add(labelOnePiece, BorderLayout.PAGE_START);
		pane.add(new JLabel("Hello world!"));
		pane.add(new JButton("Click me"), BorderLayout.PAGE_END);
		frame.setContentPane(pane);
		frame.pack();
		frame.setVisible(true);
	}
}

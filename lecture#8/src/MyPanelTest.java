import javax.swing.*;
public class MyPanelTest {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFrame demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

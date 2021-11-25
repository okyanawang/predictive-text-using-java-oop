import javax.swing.*;
public class MyPanel3Test {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFrame demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel3 panel = new MyPanel3();
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

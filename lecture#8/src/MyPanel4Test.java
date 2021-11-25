import javax.swing.*;
public class MyPanel4Test {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFrame demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel4 panel = new MyPanel4();
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

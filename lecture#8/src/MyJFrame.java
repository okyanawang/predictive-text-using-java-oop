import java.awt.*; // BorderLayout, etc.
import javax.swing.*; // JFrame, JLabel, etc.
public class MyJFrame {
	public static void main(String[] args) {
		// 1. Optional: Specify who draws the window decorations
		JFrame.setDefaultLookAndFeelDecorated(true);
		// 2. Create the frame
		JFrame frame = new JFrame("JFrame demo");
		// 3. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. Create components and put them in the frame, e.g., a label
		JLabel label = new JLabel("Hello world!");
		frame.getContentPane().add(label, BorderLayout.CENTER);
		// 5. Size the frame
		frame.pack();
		// 6. Show it
		frame.setVisible(true);
	}
}

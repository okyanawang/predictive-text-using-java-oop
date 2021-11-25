package counter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
public class View implements Observer, ActionListener {
	private MyPanel panel = new MyPanel();
	private Model model = new Model();
	public void init(String title, int value) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame(title);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model.setValue(value); // Set the value in Model
		panel.setCounter(Integer.toString(value)); // Set the value in View
        // Make the window to appear in the middle of the screen
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) screen.getWidth() / 2 - frame.getWidth() / 2,
                (int) screen.getHeight() / 2 - frame.getHeight() / 2);
        frame.setSize(500, 500);
        model.addObserver(this);
        panel.up.addActionListener(this);
        panel.down.addActionListener(this);
		frame.setContentPane(panel);
//		frame.pack();
		frame.setVisible(true);
	}
	public void update(Observable o, Object arg) {
        if (o instanceof Model) {
            panel.setCounter("" + arg);
        }
    }
	public void actionPerformed(ActionEvent e) {
		 String s = e.getActionCommand();
		 if (s.equals("UP")) {
			 model.incValue();
		 } else if (s.equals("DOWN")) {
			 model.decValue();
		 }
	}
}

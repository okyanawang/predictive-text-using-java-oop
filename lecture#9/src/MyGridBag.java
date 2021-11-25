import java.awt.*;
import javax.swing.*;
public class MyGridBag extends JPanel {
	protected void makeButton(String name, GridBagLayout gridbag, GridBagConstraints c) {
		Button button = new Button(name);
		gridbag.setConstraints(button, c);
		add(button);
	}
	public void init() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setFont(new Font("SansSerif", Font.PLAIN, 14));
		setLayout(gridbag);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		// If the space within a panel is greater than the preferredDimension of the
		// components contained within, the weightx and weighty is used to distribute the
		// extra space to the individual components.
		// E.g., use values from 0.0 to 1.0, or any value (think of this a percentage).
		// weightx is horizontal spacing, weighty is vertical spacing
		// The most common scenario is that the side panes stay a fixed size
		// (weightx/weighty = 0.0) and the center pane takes up the remaining space
		// (weightx/weighty = 1.0).
		// The extra space is allocated per the percentage of the individual components
		// weight divided by the total weight of all components in the row or column
		// E.g., if two buttons have a weightx of 0.2 and 0.8 one of the button will get
		// 20% and the other one 80% of the space
		makeButton("Row 1: Button1", gridbag, c);
		makeButton("Row 1: Button2", gridbag, c);
		makeButton("Row 1: Button3", gridbag, c);
		c.gridwidth = GridBagConstraints.REMAINDER; // End row
		makeButton("Remainder of row 1: Button4", gridbag, c);
		c.weightx = 0.0; // Reset to the default
		makeButton("Next row = row 2: Button5", gridbag, c); // Another row
		c.gridwidth = GridBagConstraints.RELATIVE; // Next-to-last in row
		makeButton("Next-to-last in row = row 3: Button6", gridbag, c);
		c.gridwidth = GridBagConstraints.REMAINDER; // End row
		makeButton("Remainder of row 3: Button7", gridbag, c);
		c.gridwidth = 1; // Reset to the default
		c.gridheight = 2;
		c.weighty = 1.0;
		makeButton("Next row = row 4: Button8", gridbag, c);
		c.weighty = 0.0; // Reset to the default
		c.gridwidth = GridBagConstraints.REMAINDER; // End row
		c.gridheight = 1; // Reset to the default
		makeButton("Next component on row 4 = row 4a: Button9", gridbag, c);
		makeButton("Next component on row 4 = row 4b: Button10", gridbag, c);
	}
	public static void main(String args[]) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("GridBagLayout demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyGridBag gridBag = new MyGridBag();
		gridBag.init();
		frame.add("Center", gridBag); // Center, North, East, South, West
		frame.pack();
		frame.setVisible(true);
	}
}
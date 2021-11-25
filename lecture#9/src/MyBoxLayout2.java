import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
public class MyBoxLayout2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BoxLayout demo");
    frame.setBounds(200, 200, 300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Box left = Box.createVerticalBox();
    ButtonGroup radioGroup = new ButtonGroup();
    JRadioButton rbutton;
    radioGroup.add(rbutton = new JRadioButton("Easy"));
    left.add(rbutton);
    radioGroup.add(rbutton = new JRadioButton("Medium"));
    left.add(rbutton);
    radioGroup.add(rbutton = new JRadioButton("Hard"));
    left.add(rbutton);
    radioGroup.add(rbutton = new JRadioButton("Mission Impossible"));
    left.add(rbutton);

    left.add(Box.createGlue());

    JPanel leftPanel = new JPanel(new BorderLayout());
    leftPanel.setBorder(new TitledBorder(new EtchedBorder(), "Game Level"));
    leftPanel.add(left, BorderLayout.CENTER);

    Box right = Box.createVerticalBox();
    right.add(Box.createVerticalStrut(30));
    right.add(new JCheckBox("Human"));
    right.add(Box.createVerticalStrut(20));
    right.add(new JCheckBox("Orc"));
    right.add(Box.createVerticalStrut(20));
    right.add(new JCheckBox("Elf"));

    right.add(Box.createGlue());

    JPanel rightPanel = new JPanel(new BorderLayout());
    rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Game Team"));
    rightPanel.add(right, BorderLayout.CENTER);

    Box top = Box.createHorizontalBox();
    top.add(leftPanel);
    top.add(Box.createHorizontalStrut(5));
    top.add(rightPanel);

    Container content = frame.getContentPane();
    content.setLayout(new BorderLayout());
    content.add(top, BorderLayout.CENTER);

    BoxLayout box = new BoxLayout(content, BoxLayout.Y_AXIS);

    content.setLayout(box);
    content.add(top);

    frame.setVisible(true);
  }
}

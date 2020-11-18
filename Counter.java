import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  Counter() {
    Frame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    leftCount = 0;
    rightCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("count" + leftCount);
    rightLabel = new JLabel("count" + rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae){
  if (ae.getActionCommand().equals("Left")){
    leftCount++;
    leftLabel.setText("count" + leftCount);
  }
  if(ae.getActionCommand().equals("Right")){
    rightCount++;
    rightLabel.setText("count" + rightCount);
  }
  if(ae.getActionCommand().equals("Reset")){
    leftCount = 0;
    rightCount = 0;
    leftLabel.setText("count" + leftCount);
    rightLabel.setText("count" + rightCount);


  }
}
}
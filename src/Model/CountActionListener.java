package Model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class CountActionListener implements ActionListener {
    private int count;
    Label countTracker;
    public CountActionListener(JButton countIncrease, Label countTracker, int count)
    {
        countIncrease.addActionListener(this);
        this.count = count;
        this.countTracker = countTracker;
    }

    public void actionPerformed(ActionEvent e) {
        this.count++;
        this.countTracker.setText(Integer.toString(count));
    }

}

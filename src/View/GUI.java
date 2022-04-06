package View;

import javax.swing.*;
import java.awt.*;
import Model.CountActionListener;

public class GUI {

    // Components
    private JFrame frame;
    private JButton clickButton;
    private JPanel panel;
    private Label counter;

    // Listeners
    private CountActionListener countActionListener;

    // Other Variables
    private int count = 1;

    public GUI() {
        this.frame = new JFrame("Button Clicker");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(300,300);

        //this.frame.getContentPane().add(button); // Adds Button to content pane of frame
        setUpComponents();
        addComponents();
        setUpContentPane();
        attachListeners();
    }

    public void display() {
        this.frame.setVisible(true);
    }

    private void setUpComponents() {
        this.panel = new JPanel();
        this.counter = new Label(Integer.toString(count));
        this.clickButton = new JButton("Press");
    }

    private void setUpContentPane() {
        this.frame.getContentPane().add(BorderLayout.SOUTH, this.panel);
        //this.frame.getContentPane().add(BorderLayout.NORTH, mb);
        //this.frame.getContentPane().add(BorderLayout.CENTER, ta);
        this.frame.setVisible(true);
    }

    private void addComponents() {
        this.panel.add(counter);
        this.panel.add(clickButton);
    }

    private void attachListeners() {
        countActionListener = new CountActionListener(clickButton, counter, count);
    }
}

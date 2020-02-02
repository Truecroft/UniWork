package swingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JPanel rootPanel;
    private JLabel hellolabel;
    private JButton helloButton;
    private JTextField nameTextField;

    public HelloWorld() {
        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String greeting = "Hello " + nameTextField.getText();
                hellolabel.setText(greeting);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

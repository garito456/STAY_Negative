package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginChoose {

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Choose Login");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());

        JPanel messagePanel = new JPanel();
        JLabel message = new JLabel("Hello! Please Choose Your Role");
        JPanel buttons = new JPanel();
        JButton customerButton = new JButton("I'm a Customer");
        JButton employeeButton = new JButton("I'm a Employee");

        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginFormCustomer loginFormCustomer = new LoginFormCustomer();
                loginFormCustomer.createAndShowGUI();
            }
        });

        employeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginFormEmployee loginFormEmployee = new LoginFormEmployee();
                loginFormEmployee.createAndShowGUI();
            }
        });
        messagePanel.add(message);
        buttons.add(customerButton);
        buttons.add(employeeButton);
        panel.add(messagePanel, BorderLayout.NORTH);
        panel.add(buttons, BorderLayout.CENTER);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}

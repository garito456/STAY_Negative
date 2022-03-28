package main.java;

import javax.swing.*;

/**
 * This file is just for testing, to make it more obv
 */
public class test {
    public static void main(String[] args) {
        try {
            // create instance of the LoginForm
//            LoginForm form = new LoginForm();
            LoginChoose loginChoose = new LoginChoose();
            loginChoose.createAndShowGUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

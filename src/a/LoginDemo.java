/**
 * 
 */
package a;
//Created by Santhoshini Arkatala, with help from Tutorials Point
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginDemo extends JFrame implements ActionListener {
    // Add icon: https://www.flaticon.com/free-icon/grocery-cart_3081900 
	
	JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    LoginDemo() {
        // Username Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        // Password Label
        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();
        // reset
        JButton resetButton = new JButton("RESET");
        // show password
        JCheckBox showPassword = new JCheckBox("Show Password");
        // Submit
        submit = new JButton("SUBMIT");
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(400, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginDemo();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
		// checking if the Manager has logged in
        if (userName.trim().equals("Manager") && password.trim().equals("Manager")) {
            message.setText("Login Successful Hello " + userName + "");
        }
// check if the user has logged in
        else if (userName.trim().equals("User") && password.trim().equals("User")) {
            message.setText("Login Successful Hello " + userName + "");
        }
        
        
// If the credentials are wrong then display Message
        else {
            message.setText(" Invalid Username or Password");
        }
    }
}
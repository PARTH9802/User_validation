import java.util.Arrays;
 import java.awt.FlowLayout;
 import javax.swing.*;
import java.awt.event.*;

 public class User_login extends JFrame implements ActionListener{
   private JLabel userLabel, passwordLabel, validateLabel;
 private JTextField userText;
  private JPasswordField password;
  private ImageIcon valid, invalid;
  private JButton logButton;
  private String username = "root";
 private char[] correctPassword = { 'r', 'o', 'o', 't', '1', '2', '3' };

          public User_login(){
         	super("Login Validation");
         	setLayout(new FlowLayout());
         	userLabel = new JLabel("Username: ");
         	passwordLabel = new JLabel("Password: ");
         	validateLabel = new JLabel();
         	userText = new JTextField(15);
         	password = new JPasswordField(15);
         	valid = new ImageIcon("tick32.png");
             invalid = new ImageIcon("cross32.png");
        logButton = new JButton("Login");
        logButton.addActionListener(this);
        add(userLabel);
        add(userText);
        add(passwordLabel);
        add(password);
        add(logButton);
        add(validateLabel);
          }

           public void actionPerformed(ActionEvent e){
        	String usr = userText.getText();
        	char[] input = password.getPassword();

                	if (usr.equals(username)) {
              if (Arrays.equals(input, correctPassword)) {
                     validateLabel.setText("You have successfully logged in.");
                 	     validateLabel.setIcon(valid);
                	  }
              else {
                  validateLabel.setText("Sorry, password is incorrect.");
                	     validateLabel.setIcon(invalid);
              }
            	}
        	else {
            	  validateLabel.setText("Sorry, username does not exist.");
            	  validateLabel.setIcon(invalid);
            	}
          }
     public static void main(String args[]){
        	User_login window = new User_login();
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setSize(300, 180);
        	window.setVisible(true);
          }
 }
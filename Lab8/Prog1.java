/* Design a registration form using Swing with following components on it – Label,
 * Textbox, Text area, Checkbox, Radio button and Button, Image */

package Lab8;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Prog1 extends JFrame {
	
	public void RegistrationForm() {
        setTitle("Registration Form");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 0));

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel interestsLabel = new JLabel("Interests:");
        JLabel agreeLabel = new JLabel("I agree to terms and conditions:");
        //JLabel imageLabel = new JLabel(new ImageIcon("path/to/image.jpg"));

        // Textboxes and Textarea
        JTextField nameTextField = new JTextField();
        JTextField emailTextField = new JTextField();
        JTextArea addressTextArea = new JTextArea();
        JScrollPane addressScrollPane = new JScrollPane(addressTextArea);
        JTextArea interestTextArea = new JTextArea();
        JScrollPane interestScrollPane = new JScrollPane(interestTextArea);

        // Checkbox
        JCheckBox agreeCheckBox = new JCheckBox();

        // Radio buttons
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        // Button
        JButton registerButton = new JButton("Register");

        // Adding components to the panel
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(emailLabel);
        mainPanel.add(emailTextField);
        mainPanel.add(addressLabel);
        mainPanel.add(addressScrollPane);
        mainPanel.add(genderLabel);
        mainPanel.add(maleRadioButton);
        mainPanel.add(new JLabel()); // Placeholder for layout purposes
        mainPanel.add(femaleRadioButton);
        mainPanel.add(interestsLabel);
        mainPanel.add(interestScrollPane);
        mainPanel.add(agreeLabel);
        mainPanel.add(agreeCheckBox);
        mainPanel.add(registerButton);

        // Adding main panel to frame
        add(mainPanel);

        setVisible(true);
    }

	public static void main(String[] args) {
		new Prog1().RegistrationForm();
	}

}
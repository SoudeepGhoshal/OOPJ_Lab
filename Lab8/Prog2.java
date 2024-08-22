/* Write a GUI program in Java with three Labels – Enter the First Number, Enter the Second Number,
 * Result, and three text fields for  - first number, second number and result and four buttons - Add, Sub,
 * multiply and reset as shown below. On clicking of any of these buttons, the corresponding operation should
 * be performed with input1 and input2 and the result should be displayed in the result box. */

package Lab8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Prog2 extends JFrame {
	JTextField num1, num2, res;
	
	public void AppFrame() {
		setTitle("Calculator");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creating the Labels
		JLabel n1 = new JLabel("Enter the First Number");
		JLabel n2 = new JLabel("Enter the Second Number");
		JLabel r = new JLabel("Result");
		
		// Creating the Text Fields
		num1 = new JTextField();
		num2 = new JTextField();
		res = new JTextField();
		res.setEditable(false);
		
		// Creating the Buttons
		JButton add = new JButton("Add");
		JButton sub = new JButton("Sub");
		JButton mul = new JButton("Multiply");
		JButton reset = new JButton("Reset");
		
		//Creating the Main Panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0,5));
		
		//Adding elements to mainPanel
		mainPanel.add(n1);
		mainPanel.add(num1);
		mainPanel.add(add);
		mainPanel.add(sub);
		mainPanel.add(mul);
		mainPanel.add(n2);
		mainPanel.add(num2);
		mainPanel.add(new JLabel()); // For layout purpose
		mainPanel.add(reset);
		mainPanel.add(new JLabel()); // For layout purpose
		mainPanel.add(r);
		mainPanel.add(res);
		
		// Adding Action Listeners
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res.setText(Double.toString(calc(1)));
			}
		});
		sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                res.setText(Double.toString(calc(2)));
            }
        });
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res.setText(Double.toString(calc(3)));
			}
		});
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res.setText("");
			}
		});
		
		//Adding mainPanel to Frame
		add(mainPanel);
		
		//pack();
		setVisible(true);
	}
	
	double calc(int ch) {
		double result = 0;
		double n1 = 0, n2 = 0;
		
		try {
			n1 = Double.parseDouble(num1.getText());
			n2 = Double.parseDouble(num2.getText());
		} catch (Exception e) {
			res.setText("Invalid Input");
		}
		
		switch (ch) {
		case 1:
			result = n1 + n2;
			break;
		case 2:
			result = n1 - n2;
			break;
		case 3: 
			result = n1 * n2;
			break;
		default:
		}
		
		return(result);
	}

	public static void main(String[] args) {
		new Prog2().AppFrame();
	}

}
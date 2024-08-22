/* Design a GUI application which consists of three Label named as Red, Green and blue, three combo boxes
 * which will consist the value from 0 to 255 and one button named as show output. The user will select
 * different values from three combo boxes. When the user clicks on the button, the panel background will be
 * changed accordingly as per the value passed in RGB format. */

package Lab8;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Prog4 extends JFrame{
	
	public Prog4() {
		setTitle("Colours");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Main Panel
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255,255,255));
		mainPanel.setLayout(new GridLayout(0,6));
		
		String range[] = new String[256];
		for (int i=0; i < 256; i++) {
			range[i] = Integer.toString(i);
		}
		
		// Adding the range Lists
		JList<String> red = new JList<>(range);
		red.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JList<String> green = new JList<>(range);
		green.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JList<String> blue = new JList<>(range);
		blue.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Creating Change button
		JButton change = new JButton("Change");
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRed = Integer.parseInt(red.getSelectedValue());
					int selectedGreen = Integer.parseInt(green.getSelectedValue());
					int selectedBlue = Integer.parseInt(blue.getSelectedValue());
					mainPanel.setBackground(new Color(selectedRed, selectedGreen, selectedBlue));
				} catch(Exception ex) {
					System.out.println("Invalid");
				}
				
			}
		});
		
		// Adding components to Main Panel
		mainPanel.add(new JLabel("Red"));
		mainPanel.add(new JScrollPane(red));
		//mainPanel.add(red);
		mainPanel.add(new JLabel("Green"));
		mainPanel.add(new JScrollPane(green));
		mainPanel.add(new JLabel("Blue"));
		mainPanel.add(new JScrollPane(blue));
		mainPanel.add(change);
		
		add(mainPanel);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Prog4();

	}

}

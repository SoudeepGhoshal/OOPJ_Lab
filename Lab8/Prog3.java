/* Implement a GUI application which consists of one List Box and one button. The list box will have four
 * different color names. When the user will select a color from the list box and click on the button, the
 * panel color will be changed to that color. */

package Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Prog3 extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private JList<String> colorList;
    private JButton changeButton;

    public Prog3() {
        // Create the main frame
    	frame = new JFrame();
        frame.setTitle("Color Selector");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel to display the selected color
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        frame.add(panel, BorderLayout.CENTER);

        // Create the list of colors
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        frame.add(new JScrollPane(colorList), BorderLayout.WEST);

        // Create the button to change the color
        changeButton = new JButton("Change Color");
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                if (selectedColor != null) {
                    switch (selectedColor) {
                        case "Red":
                            panel.setBackground(Color.RED);
                            break;
                        case "Green":
                            panel.setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            panel.setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            panel.setBackground(Color.YELLOW);
                            break;
                        default:
                            break;
                    }
                }
            }
        });
        frame.add(changeButton, BorderLayout.SOUTH);

        // Set the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Prog3();
            }
        });
    }
}
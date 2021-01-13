import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// the button listens to a click event from the user
// which runs code which then changes other objects (importantly the count object)
public class GUI implements ActionListener {
	
	// here we are creating the "J" objects outside the GUI method so
	// they are accessible at a global scope level
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	// this is where we make our constructor
	public GUI() {
		
		// just like any other object we are just 
		// saying the name of the object and calling
		// the constructor after new word
		frame = new JFrame();
		
		JButton button = new JButton("Click Me");
		// this represents this class in this case
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		
		
		panel = new JPanel();
		// setBorder take a border object that you have to create from Border factory
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		// this sets what happens when they close the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our Gui");
		// set the window to match a certain size
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// when we call main it builds a new GUI object which 
		// will call the GUI method
		new GUI();
	}

	// When we click that button object it listens and executes the code
	// in the below actionPerformed method
	@Override
	public void actionPerformed(ActionEvent e) {
		// Here is where you add the code for when the button is clicked
		count++;
		label.setText("Number of clicks: " + count);
	}

}

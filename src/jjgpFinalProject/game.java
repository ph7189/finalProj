package jjgpFinalProject;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class game{
	
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args){
		new game().start();
	}

	private void start() {
		
		frame = new JFrame("Hearthstone");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

}

package jjgpFinalProject;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class game{
	
	public enum Class{Mage, Paladin};
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
		frame.setSize(1920, 1080);
		frame.setVisible(true);
		panel.setBackground(Color.BLACK);
		frame.repaint();
	}

}

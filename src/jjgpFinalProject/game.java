package jjgpFinalProject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class game{
	
	board board= new board();
	
	public enum Class{Mage, Paladin};
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args){
		new game().start();
	}

	private void start() {
		
		frame = new JFrame("Hearthstone");
		panel = new JPanel();
		panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGame(g);
			}
		};
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setSize(1950, 1160);
		frame.setVisible(true);
		panel.setBackground(Color.BLACK);
		frame.repaint();
	}
	
	private void drawGame(Graphics g) {
		
		board.draw(g);
	}

}

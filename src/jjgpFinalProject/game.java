package jjgpFinalProject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class game{
	
	JFrame frame;
	JPanel panel;
	hero h1, h2;
	
	public static void main(String[] args){
		new game().start();
	}

	private void start() {
		
		h1 = new hero(0);
		h2 = new hero(1);
		
		frame = new JFrame("Hearthstone");
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
		frame.setSize(1920, 1080);
		frame.setVisible(true);
		panel.setBackground(Color.BLACK);
		//h1.attack(h2);
		frame.repaint();
	}
	
	public void drawGame(Graphics g) {
		h1.draw(g);
		h2.draw(g);
	}

}

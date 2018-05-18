package jjgpFinalProject;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class board{
	private Image image;
	public board() {
		try {
			image= ImageIO.read(new File("src/board.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void draw(Graphics g) {
		g.drawImage(image,0,0,null);
	}
}

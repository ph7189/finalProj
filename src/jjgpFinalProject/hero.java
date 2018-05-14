package jjgpFinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class hero{

	private int hp;
	private weapon curWeapon;
	private int heroNum;
	private Image image;

	public hero(int whichOne) {
		hp = 30;
		curWeapon = new defaultWeapon();
		heroNum = whichOne;
		if (heroNum == 0) {
			try {
				image = ImageIO.read(new File("src/jjgpFinalProject/h1.gif"));
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				image = ImageIO.read(new File("src/jjgpFinalProject/h2.png"));
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		image = image.getScaledInstance(125, 150, Image.SCALE_DEFAULT);
		// TODO Auto-generated constructor stub
	}

	public void giveWeapon(weapon w) {
		curWeapon = w;
	}
	
	public int gethp() {
		return hp;
	}
	
	public weapon getWeapon() {
		return curWeapon;
	}

	public void dmg(int i) {
		hp -= i;
	}

	public void attack(minion m) {
		if (curWeapon != null) {
			m.dmg(curWeapon.getDmg());
			curWeapon.reduceDura(1);
			dmg(m.getatk());
		}
	}
	
	public void attack(hero h) {
		if (curWeapon != null) {
			h.dmg(curWeapon.getDmg());
			curWeapon.reduceDura(1);
		}
	}
	
	public void draw(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 36));
		g.drawImage(image, 720, 720*heroNum, null);
		g.setColor(Color.RED);
		g.fillOval(807, 110+720*heroNum, 60, 60);
		g.setColor(Color.WHITE);
		g.drawString(""+hp, 815, 150+720*heroNum);
	}

}

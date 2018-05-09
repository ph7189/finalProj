package jjgpFinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class hero{

	private int hp;
	private weapon curWeapon;
	private int heroNum;

	public hero(int whichOne) {
		hp = 30;
		curWeapon = null;
		heroNum = whichOne;
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
		g.setFont(new Font("TimesRoman", Font.PLAIN, 48));
		g.setColor(Color.RED);
		g.drawString("HERO "+heroNum, 600, 120+600*heroNum);
	}

}

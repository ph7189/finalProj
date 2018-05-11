package jjgpFinalProject;

public abstract class weapon{

	private int dura;
	private int dmg;
	
	public weapon(int dura, int dmg) {
		this.dura = dura;
		this.dmg = dmg;
	}
	
	public int getDura() {
		return dura;
	}
	
	public int getDmg() {
		return dmg;
	}
	
	public void reduceDura(int i) {
		dura -= i;
	}

}

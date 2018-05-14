package jjgpFinalProject;

public abstract class minion{

	private int hp;
	private int maxhp;
	private int atk;
	
	
	public minion(int hp, int atk) {
		this.hp = hp;
		this.maxhp = this.hp;
		this.atk = atk;
	}
	
	public int gethp() {
		return hp;
	}
	
	public int getatk() {
		return atk;
	}
	
	public abstract void draw();
	public void dmg(int i) {
		hp -= i;
	}
	public void heal(int i) {
		hp = Math.min(hp+i, maxhp);
	}
	
	public void attack(minion m) {
		m.dmg(getatk());
		dmg(m.getatk());
	}
	public void attack(hero h) {
		h.dmg(getatk());
	}
	
	public abstract void battleCry();
	

}

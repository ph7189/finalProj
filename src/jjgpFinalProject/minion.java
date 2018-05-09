package jjgpFinalProject;

public abstract class minion{
	private int maxhp;
	private int hp;
	private int atk;
	
	public minion(int hp, int atk) {
		this.hp = hp;
		this.atk = atk;
		maxhp = this.hp;
				
	}
	public int gethp() {
		return hp;
	}
	public int getatk() {
		return atk;
	}
	public abstract void draw();
	public void sethp(int i) {
		hp = i;
		maxhp = i;
	}
	public void dmg(int i) {
		hp -= i;
		
	}
	public void heal(int i) {
		hp += i;
		if (hp > maxhp) {
			hp = maxhp;
		}
	}
	public void setatk(int i){
		atk=i;
	}
	public void play() {
		
	}
	
	public abstract void battleCry();
	

}

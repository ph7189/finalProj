package jjgpFinalProject;

public abstract class card {
	private int manaCost;
	private minion m;
	private spell s;
	private weapon w;
	//public enum Type{Wisp, Minion, Weapon, Spell};
	//Type type;
	/*public card(Type t) {
		type=t;
		switch(t){
		case Wisp:
			m = new wispcard();
			break;
		case Minion:
			m = new wispcard();
			break;
		}	
	}*/
	public card(minion min){
		m = min;
		s = null;
		w = null;
	}
	public card(spell spl) {
		s=spl;
		m = null;
		w = null;
	}
	public card(weapon w){
		this.w=w;
		m = null;
		s = null;
	}
	public void play() {
		if(m!=null){
			m.play();
		}
		else if(w!=null){
			
		}
		else if(s!=null){
			
		}
	}
}

package jjgpFinalProject;

public abstract class card {
	
	private int manaCost;
	public enum Type{Minion, Weapon, Spell};
	private Type cardType;
	
	public card(Type t) {
		cardType = t;
	}

}

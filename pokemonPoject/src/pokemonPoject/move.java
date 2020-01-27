package pokemonPoject;

public class move {
	private String name;
	private String type;
	private String atkType;
	private int atk;
	private int hitChance;
	private int pp;

	public move(String name, String type, String atkType, int atk, int hitChance, int pp) {
		this.name = name;
		this.type = type;
		this.atkType = atkType;
		this.atk = atk;
		this.hitChance = hitChance;
		this.pp = pp;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getAtkType() {
		return atkType;
	}

	public int getAtk() {
		return atk;
	}

	public int getHitChance() {
		return hitChance;
	}
	
	public int getPp() {
		return pp;
	}
	
	
}

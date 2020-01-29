package pokemonPoject;

public class move {
	private String name;
	private String type;
	private String atkType;
	private int power;
	private int hitChance;
	private int pp;

	public move(String name, String type, String atkType, int power, int hitChance, int pp) {
		this.name = name;
		this.type = type;
		this.atkType = atkType;
		this.power = power;
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

	public int getPower() {
		return power;
	}

	public int getHitChance() {
		return hitChance;
	}
	
	public int getPp() {
		return pp;
	}
	
	public String toString() {
		return "Name :" + name + "\n" +
				"Type :" + type + "\n" +
				"Phs/Sp? :" + atkType + "\n" +
				"Power :" + power + "\n" +
				"Acc :" + hitChance + "\n" +
				"PP :" + pp; 

	}
	
	
}

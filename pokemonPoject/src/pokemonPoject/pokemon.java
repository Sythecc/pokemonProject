package pokemonPoject;

public class pokemon {
	private String name;
	private String type;
	private int num;
	private int hp;
	private int phsAtk;
	private int phsDef;
	private int spAtk;
	private int spDef;
	private int speed;
	
	public pokemon(String name, String type, int num, int hp, int phsAtk, int phsDef, int spAtk, int spDef, int speed) {
		this.name = name;
		this.type = type;
		this.num = num;
		this.hp = hp;
		this.phsAtk = phsAtk;
		this.phsDef = phsDef;
		this.spAtk = spAtk;
		this.spDef = spDef;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNum() {
		return num;
	}

	public int getHp() {
		return hp;
	}

	public int getPhsAtk() {
		return phsAtk;
	}

	public int getPhsDef() {
		return phsDef;
	}

	public int getSpAtk() {
		return spAtk;
	}

	public int getSpDef() {
		return spDef;
	}

	public int getSpeed() {
		return speed;
	}
	
	
}

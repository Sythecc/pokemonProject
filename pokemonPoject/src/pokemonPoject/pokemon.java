package pokemonPoject;

@SuppressWarnings("unused")
public class pokemon {
	private String name;
	private String type1;
	private String type2;
	private int num;
	private int hp;
	private int phsAtk;
	private int phsDef;
	private int spAtk;
	private int spDef;
	private int speed;

	public pokemon(String name, String type1, String type2, int num, int hp, int phsAtk, int phsDef, int spAtk,
			int spDef, int speed) {
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
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

	public String getType1() {
		return type1;
	}

	public String getType2() {
		return type2;
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
	
	public void dealDamage(double damage) {
		hp-=(int)damage;
	}

	public String toString() {
		return "Number :" + num + "\n" +
				"Name :" + name + "\n" +
				"Type1 :" + type1 + "\n" +
				"Type2 :" + type2 + "\n" +
				"HP :" + hp + "\n" +
				"Attack :" + phsAtk + "\n" +
				"Defense :" + phsDef + "\n" +
				"Sp. Atk :" + spAtk + "\n" +
				"Sp. Def :" + spDef + "\n" +
				"Speed :" + speed + "\n";

	}

}

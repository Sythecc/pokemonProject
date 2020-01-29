package pokemonPoject;

import java.util.ArrayList;
import java.util.List;

public class pokedex {
	private static List<pokemon> pokedex = new ArrayList<pokemon>();

	public pokedex() {
		
	}
	
	public static void addMon(pokemon mon){
		pokedex.add(mon);
	}
	
	public static pokemon getMon(int num) {
		num--;
		return pokedex.get(num);
	}
	public static pokemon getMon(String name) {
		for(pokemon mon : pokedex) {
			String monName = mon.getName();
			if(monName.toLowerCase().equals(name.toLowerCase())) {
				return mon;
			}
		}
		return null;
	}
}

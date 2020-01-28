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
	
	public static void getMon(int num) {
		num--;
		System.out.println(pokedex.get(num));
	}
	public static void getMon(String name) {
		for(pokemon mon : pokedex) {
			String monName = mon.getName();
			if(monName.toLowerCase().equals(name.toLowerCase())) {
				System.out.println(mon);
			}
		}
	}
}
